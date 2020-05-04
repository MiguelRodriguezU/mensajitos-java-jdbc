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
public class Mensaje {
    private int id;
    private String mensaje;
    private String autor;
    private String fecha;

    public Mensaje() {
    }

    public Mensaje(String mensaje, String autor) {
        this.mensaje = mensaje;
        this.autor = autor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
