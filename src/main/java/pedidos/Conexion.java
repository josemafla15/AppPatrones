
package pedidos;

import java.awt.HeadlessException;
import static java.lang.Class.forName;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
    private Conexion(){
        
    }
    
    private static Connection conexion;
    
    private static Conexion instance;
    
    private static final String URL = "jdbc:mysql://localhost/venta_hamburguesas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Connection conectar(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            System.out.println("Conexion exitosa");
            return conexion;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error" + e);
        }
        
        return conexion; 
    }
    
    public void desconectar() throws SQLException{
        try{
            conexion.close();
            System.out.println("Se desconecto de la base de datos");
        }
        catch(SQLException e){
            System.out.println("Error" + e);
            conexion.close();
        }
        finally{
            conexion.close();
        }
    }
    
    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    } 
}
