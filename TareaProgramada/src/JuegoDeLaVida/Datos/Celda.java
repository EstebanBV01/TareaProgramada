/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Datos;

/**
 *
 * @author Johan
 */
public class Celda {
   private int estado;
    public Celda(){
        this(0);
    }
    public Celda(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Celda{" + "estado=" + estado + '}';
    }
   
}
