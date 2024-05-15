
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
        
        Alumno alum1=new Alumno(34690876,"Gomez","Patricio",LocalDate.of(1988, Month.MARCH, 15),true);
        AlumnoData x=new AlumnoData();
        
        x.guardarAlumno(alum1);
        
        
        
        
       
    }
    
}
