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
public class Administrador extends Persona implements Serializable{
    private String contraseña;

    public Administrador(String nombre, String Apellido, String rut ,String contraseña) {
        super(nombre, Apellido, rut);
        this.contraseña = contraseña;
    }


    
 
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
}
