/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdev.mensajitosapp;

import java.util.Scanner;

/**
 *
 * @author MIGUEL
 */
public class MensajeService {
    public static void crear(){
        Scanner sc = new Scanner(System.in);
        String nombre = "", msj = "";
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Mensaje: ");
        msj = sc.nextLine();
        
        MensajeDAO.insert(new Mensaje(msj, nombre));
    }
    
    public static void listar(){
        MensajeDAO.read();
    }
    
    public static void borrar(){
        Scanner sc = new Scanner(System.in);
        int idMensaje = 0;
        System.out.print("Id mensaje a borrar: ");
        
        idMensaje = sc.nextInt();
        MensajeDAO.delete(idMensaje);
    }
    
    public static void actualizar(){
        Scanner sc = new Scanner(System.in);
        int idMensaje = 0;
        String autor = "", msj = "";
               
        System.out.print("Autor : ");
        autor = sc.nextLine();
        System.out.print("Mensaje: ");
        msj = sc.nextLine();
        
        System.out.print("Id mensaje a actualizar: ");
        idMensaje = sc.nextInt();
        
        Mensaje mensaje = new Mensaje();
        mensaje.setId(idMensaje);
        mensaje.setMensaje(msj);
        mensaje.setAutor(autor);
        
        MensajeDAO.update(mensaje);
    }
}
