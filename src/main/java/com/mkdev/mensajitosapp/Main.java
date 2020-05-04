/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkdev.mensajitosapp;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author MIGUEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        do{
            System.out.println("----- MENU ----- ");
            System.out.println("Aplicación de mensajes");
            System.out.println(" 1. Crear");
            System.out.println(" 2. Listar");
            System.out.println(" 3. Eliminar");
            System.out.println(" 4. Actualizar");
            System.out.println(" 5. Salir");
            
            opt = sc.nextInt();
            
            switch(opt){
                case 1: MensajeService.crear();
                    break;
                case 2: MensajeService.listar();
                    break;
                case 3: MensajeService.borrar();
                    break;
                case 4: MensajeService.actualizar();
                    break;
                default: break;
            }
            
        }while(opt!=5);
        
    }
    
}
