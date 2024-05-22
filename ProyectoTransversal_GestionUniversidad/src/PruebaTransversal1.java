
import accesoADatos.AlumnoData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author Cristian
 */
public class PruebaTransversal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* GUARDAR ALUMNO
        Alumno alum1=new Alumno(34690876,"Gomez","Patricio",LocalDate.of(1988, Month.MARCH, 15),true);
        AlumnoData x=new AlumnoData();
        x.guardarAlumno(alum1);
        */
        
        /* MODIFICAR ALUMNO
        Alumno alum1=new Alumno(4, 34690876,"paez","Patricio",LocalDate.of(1988, Month.MARCH, 15),true);
        AlumnoData x=new AlumnoData();
        x.modificarAlumno(alum1);
        */
        
        /* ELIMINAR ALUMNO (Pasa el estado a false)
        AlumnoData x=new AlumnoData();
        x.eliminarAlumno(4);
       */
        
        /* BUSCAR ALUMNO
        AlumnoData x=new AlumnoData();
        Alumno ale = x.buscarAlumno(4);
        System.out.println("Nombre: "+ ale.getNombre());
        System.out.println("Apellido: "+ ale.getApellido());
        System.out.println("DNI: "+ ale.getDni());
        */
        
        /* BUSCAR ALUMNO POR DNI
        AlumnoData x=new AlumnoData();
        Alumno ale = x.buscarAlumnoPorDNI(2324256);
        System.out.println("Nombre: "+ ale.getNombre());
        System.out.println("Apellido: "+ ale.getApellido());
        System.out.println("DNI: "+ ale.getDni());
        */
        
        /* LISTADO ALUMNOS
        AlumnoData x=new AlumnoData();
        for (Alumno ale : x.listarAlumnos()) {
            System.out.println("Nombre: "+ ale.getNombre());
            System.out.println("Apellido: "+ ale.getApellido());
            System.out.println("DNI: "+ ale.getDni());
        }
        */
        
        /* GUARDAR MATERIA
        Materia materia = new Materia("Ingles II", 2, true);
        MateriaData mat = new MateriaData();
        mat.guardarMateria(materia);
        */
        
        /* BUSCAR MATERIA
        MateriaData mat = new MateriaData();
        Materia lab = mat.buscarMateria(4);
        System.out.println("ID Materia: "+ lab.getIdMateria());
        System.out.println("Nombre: "+ lab.getNombre());
        System.out.println("Año: "+ lab.getAnioMateria());
        System.out.println("Estado: "+ lab.isActivo());
        */
        
        /* MODIFICAR MATERIA
        Materia mat = new Materia(10, "Ingles III", 3, true);
        MateriaData x = new MateriaData();
        x.modificarMateria(mat);
        */
        
        /* ELIMINAR MATERIA (Pasa el estado a false)
        MateriaData mat = new MateriaData();
        mat.eliminarMateria(10);
        */
        
        /* LISTADO MATERIAS
        MateriaData mat = new MateriaData();
        for (Materia lab : mat.listarMaterias()) {
            System.out.println("ID Materia: "+ lab.getIdMateria());
            System.out.println("Nombre: "+ lab.getNombre());
            System.out.println("Año: "+ lab.getAnioMateria());
            System.out.println("Estado: "+ lab.isActivo());
        }
        */
        
    }
    
}
