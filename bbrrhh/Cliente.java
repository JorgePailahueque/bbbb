/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbrrhh;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Cliente extends Persona implements Serializable{
    private String correo;
    private int numeroT;
    private ArrayList<Reservacion>reservaciones = new ArrayList();
    
    public Cliente(String nombre, String Apellido, String rut, String correo, String numeroT) {
        super(nombre, Apellido, rut);
        this.correo = correo;
        this.numeroT = Integer.parseInt(numeroT);
       
    }

    public void agregarReservacion(String nochesEstadia, Habitacion x){
        reservaciones.add(new Reservacion(nochesEstadia,x));
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(int numeroT) {
        this.numeroT = numeroT;
    }

    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(ArrayList<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", numeroT=" + numeroT + '}';
    }

   
    
}
