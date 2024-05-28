/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Cristian
 */
public class InscripcionData {


/**
 *
 * @author Cristian
 */


    private Connection con = null;
    private MateriaData mat = new MateriaData();
    private AlumnoData alum = new AlumnoData();

    public InscripcionData() {
        this.con = Conexion.getConexion();

    }

    public void guardarInscripcion(Inscripcion inscrip) {
        String SQL = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscrip.getAlumno().getIdAlumno());
            ps.setInt(2, inscrip.getMateria().getIdMateria());
            ps.setDouble(3, inscrip.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscrip.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion realizada");

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public void borrarInscripcion(int idAlumno, int idMateria) {
        String SQL = "Delete from inscripcion WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String SQL = "UPDATE inscripcion SET nota=? WHERE idAlumno=? and idMateria=? ";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Actualizacion realizada");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public List<Inscripcion> obtenerInscripciones() {

        ArrayList<Inscripcion> cursadas = new ArrayList();
        String SQL = "Select * From inscripcion";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = alum.buscarAlumno(rs.getInt("idAlumno"));
                Materia mater = mat.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mater);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }

    public List<Inscripcion> InscripcionesPorAlumnos(int idAlumno) {

        ArrayList<Inscripcion> cursadas = new ArrayList();
        String SQL = "Select * From inscripcion WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = alum.buscarAlumno(rs.getInt("idAlumno"));
                Materia mater = mat.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mater);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
        return cursadas;
    }

    public List<Materia> materiasCursadas(int idAlumno) {

        ArrayList<Materia> materias = new ArrayList();

        String SQL = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion, "
            + "materia WHERE inscripcion.idMateria = materia.idMateria "
            + "AND inscripcion.idAlumno = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

        return materias;

    }

    public List<Materia> materiasNoCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();
        String SQL = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

        return materias;

    }

    public List<Alumno> alumnosCursandoMateria(int idMateria) {
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();

       String SQL = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
               + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND i.idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a alguna de las tablas");
        }

        return alumnosMateria;
    }
}
