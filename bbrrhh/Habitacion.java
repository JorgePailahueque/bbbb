
package bbrrhh;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Habitacion implements Serializable{
    private String tipo;
    private int monto;
    private String estado;
    private int numero;
    public Habitacion(String tipo, int monto, String estado, int numero) {
        this.estado = estado;
        this.monto = monto;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + ", monto=" + monto + ", estado=" + estado + ", numero=" + numero ;
    }

    
}
