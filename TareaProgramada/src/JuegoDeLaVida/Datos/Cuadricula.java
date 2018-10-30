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
    Celda cuadricula;
    public Cuadricula(){
    //this("");
    }
    public Cuadricula(Celda cuadricula) {
        this.cuadricula = cuadricula;
    }

    public Celda  getCuadricula() {
        return cuadricula;
    }

    public void setCuadricula(Celda  cuadricula) {
        this.cuadricula = cuadricula;
    }

    @Override
    public String toString() {
        return "Cuadricula{" + "cuadricula=" + cuadricula + '}';
    }
    
}
