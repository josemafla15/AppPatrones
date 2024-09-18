/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jose Mafla
 */
public class Pedido implements Forma{
    
    Conexion conexion = Conexion.getInstance();
    
    private String tipoCarne;
    private int cantidadCarnes;
    private String tipoPan;
    private String bebida;
    
    public Pedido(String tipoCarne, int cantidadCarnes, String tipoPan, String bebida){
    this.tipoCarne = tipoCarne;
    this.cantidadCarnes = cantidadCarnes;
    this.tipoPan = tipoPan;
    this.bebida = bebida;
    }

    Pedido() {
        
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public void setCantidadCarnes(int cantidadCarnes) {
        this.cantidadCarnes = cantidadCarnes;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public int getCantidadCarnes() {
        return cantidadCarnes;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public String getBebida() {
        return bebida;
    }
    
    

    
    @Override
    public Forma clone(){
        return new Pedido(this.tipoCarne, this.cantidadCarnes, this.tipoPan, this.bebida);
    }
    
    @Override
    public void cocinar(){
        System.out.println("La carne de su hamurguesa es de:" + " " + this.tipoCarne + ", tiene "  + this.cantidadCarnes + " carnes, pan tipo: " + this.tipoPan + " y el combo trae " +this.bebida);
    }
    
    
    
}
    
    


    

