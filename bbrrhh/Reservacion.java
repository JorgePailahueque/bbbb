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
public class Reservacion implements Serializable {
    private int nocheDeEstadia;
    private Habitacion habitacion;
    private int monto;
    
    public Reservacion(String nocheDeEstadia,Habitacion x) {
        this.nocheDeEstadia = Integer.parseInt(nocheDeEstadia);
        this.habitacion = x;
        this.monto=(Integer.parseInt(nocheDeEstadia)*x.getMonto());
    }

    public int getNocheDeEstadia() {
        return nocheDeEstadia;
    }

    public void setNocheDeEstadia(int nocheDeEstadia) {
        this.nocheDeEstadia = nocheDeEstadia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
