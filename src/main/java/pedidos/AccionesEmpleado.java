/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author Jose Mafla
 */
import java.sql.*;

public class AccionesEmpleado {
    
    Conexion conexion = Conexion.getInstance();
    
    public void crear (Pedido pedido){
        
        try{
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("Insert into pedido values (null,?,?,?,?)");
        
            insertar.setString(1,pedido.getTipoCarne());
            insertar.setInt(2,pedido.getCantidadCarnes());
            insertar.setString(3,pedido.getTipoPan());
            insertar.setString(4,pedido.getBebida());
            insertar.executeUpdate();
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void crearOtro (Pedido pedido){
        
        try {
            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("Insert into pedido values (null,?,?,?,?)");

            insertar.setString(1, pedido.getTipoCarne());
            insertar.setInt(2, pedido.getCantidadCarnes());
            insertar.setString(3, pedido.getTipoPan());
            insertar.setString(4, pedido.getBebida());
            insertar.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
}
