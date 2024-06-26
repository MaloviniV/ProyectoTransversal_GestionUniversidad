package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "universidad_ulp";
    private static final String USUARIO = "root";
    private static final String PASSWORD =  "";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        if (connection == null) {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
            }  
        }  
        return connection;
    }
}
