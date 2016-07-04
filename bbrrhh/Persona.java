/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbrrhh;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Persona implements Serializable {
    private String nombre;
    private String Apellido;
    private String rut;
  
    public Persona(String nombre, String Apellido, String rut) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.rut = rut;
   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", rut=" + rut + '}';
    }

    

    
}
