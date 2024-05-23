/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String SQL = "INSERT INTO alumno (dni, apellido, nombre,"
                + " fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se creo el alumno");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        String SQL = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?,"
                + " fechaNacimiento = ?, estado = ? WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void eliminarAlumno(int id){
        String SQL = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps =  con.prepareStatement(SQL);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public Alumno buscarAlumno(int id){
        String SQL = "SELECT dni, apellido, nombre, fechaNacimiento "
                + "FROM alumno WHERE idAlumno = ?";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");        
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDNI(int dni){
        String SQL = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento "
                + "FROM alumno WHERE dni = ?";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                //alumno.setActivo(true);
                alumno.setActivo(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un alumno con ese id");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");        
        }
        return alumno;
    }
    
    public List<Alumno> listarAlumnos(){
        String SQL = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento "
                + "FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                alumnos.add(alumno);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");        
        }
        return alumnos;
    }
}
