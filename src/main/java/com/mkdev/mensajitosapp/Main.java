/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdev.mensajitosapp;

/**
 *
 * @author MIGUEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion cn = new Conexion();
        if(cn.getConexion() != null){
            System.out.println("Conexión OK!");
        }else{
            System.out.println("Conexión KO!");
        }
    }
    
}
