/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdev.mensajitosapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MIGUEL
 */
public class Conexion {
    private static Connection cnx = null;
    
    public static Connection getConexion(){
        if(cnx == null){
            conect();
        }else{
            try {
                if(cnx.isClosed()){
                    System.out.println("Conexión está cerrada");
                    conect();
                }
            } catch (SQLException e) {
                System.out.println("Error al reintentar abrir conexión: "+e.getMessage());
            }
        }
        return cnx;
    }
    
    private static void conect(){
        try {
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3307/mensajeria?serverTimezone=UTC","root","");
            if(cnx != null){
                System.out.println("Conexión establecida!");
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
