/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Datos;

import JuegoDeLaVida.InteraccionUs.Main;

/**
 *
 * @author Juan Carlos,EstebanBV, Fernanda
 * @version 28/10/2018
 */
public abstract class Cuadricula extends Main{
    Celda celda;
    public Cuadricula(){
    //this(0);
    }
    public Cuadricula(Celda celda) {
        this.celda = celda;
    }

    public Celda  getCuadricula() {
        return celda;
    }

    public void setCuadricula(Celda  celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "Cuadricula{" + "cuadricula=" + celda+ '}';
    }
    
}
