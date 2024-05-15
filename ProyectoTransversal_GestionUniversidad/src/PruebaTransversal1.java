
import accesoADatos.AlumnoData;
import entidades.Alumno;
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
        
        
        
    }
    
}
