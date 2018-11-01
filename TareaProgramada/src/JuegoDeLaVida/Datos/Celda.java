/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Datos;

/**
 *
 * @author Esteban, Fernanda, Juan Carlos
 */
public class Celda {

    boolean celdas;
    
    public Celda () {
        this(false);   
    }

    public Celda(boolean celdas) {
       this.celdas = celdas;
    }

    public boolean isCeldas() {
        return celdas;
    }

    public void setCeldas(boolean celdas) {
        this.celdas = celdas;
    }

    @Override
    public String toString() {
        return "Celda{" + "celdas=" + celdas + '}';
    }
}
