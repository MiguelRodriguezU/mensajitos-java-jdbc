/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdev.mensajitosapp;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MIGUEL
 */
public class MensajeDAO {
    //private String querySQL = "";
    public static void insert(Mensaje mensaje){
        try(Connection cn = Conexion.getConexion()){
            
            PreparedStatement ps = null;
            try {
                String query = "insert into mensaje(mensaje, autor) values(?,?)";
                ps = cn.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor());
                ps.executeUpdate();
                
                System.out.println("Insert OK!");
                
            } catch (SQLException e) {
                System.out.println("Error 1: "+e.getMessage());
            }
        }catch(SQLException e){
            System.out.println("Error: 2"+e.getMessage());
        }
    }
    
    public static void read(){
        try(Connection cn = Conexion.getConexion()){
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try {
                String query = "select * from mensaje";
                ps = cn.prepareStatement(query);
                rs = ps.executeQuery();              
                
                while(rs.next()){
                    System.out.println("id: "+rs.getInt("id"));
                    System.out.println("Autor: "+rs.getString("autor"));
                    System.out.println("Mensaje: "+rs.getString("mensaje"));
                }
                
            } catch (SQLException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }catch(SQLException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
    public static void delete(int idMensaje){
        try(Connection cn = Conexion.getConexion()){
            
            PreparedStatement ps = null;
            try {
                String query = "delete from mensaje where id = ? ";
                ps = cn.prepareStatement(query);
                ps.setInt(1, idMensaje);
                int rowsAfected = ps.executeUpdate();
                System.out.println("Mensaje borrado: "+rowsAfected);
                
            } catch (SQLException e) {
                System.out.println("Error 1: "+e.getMessage());
            }
        }catch(SQLException e){
            System.out.println("Error: 2"+e.getMessage());
        }
    }
    
    public static void update(Mensaje mensaje){
        try(Connection cn = Conexion.getConexion()){
            
            PreparedStatement ps = null;
            try {
                String query = "update mensaje set mensaje = ?, autor = ? where id = ? ";
                ps = cn.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor());
                ps.setInt(3, mensaje.getId());
                int rowsAfected = ps.executeUpdate();
                
                System.out.println("Mensaje actualizado: "+rowsAfected);
                
            } catch (SQLException e) {
                System.out.println("Error 1: "+e.getMessage());
            }
        }catch(SQLException e){
            System.out.println("Error: 2"+e.getMessage());
        }
    }
    
    
    
}
