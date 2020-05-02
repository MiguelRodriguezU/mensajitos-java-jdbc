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
    
    public Connection getConexion(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/mensajeria?serverTimezone=UTC","root","");
            if(conexion != null){
                System.out.println("Conexión establecida!");
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return conexion;
    }
    
}
