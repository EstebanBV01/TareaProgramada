/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprogramada;

/**
 *
 * @author Juan Carlos,EstebanBV
 * @version 28/10/2018
 */
public abstract class Cuadricula extends TareaProgramada{
    Celda[][] cuadricula;
    public Cuadricula(){
    //this("");
    }
    public Cuadricula(Celda[][] cuadricula) {
        this.cuadricula = cuadricula;
    }

    public Celda[][] getCuadricula() {
        return cuadricula;
    }

    public void setCuadricula(Celda[][] cuadricula) {
        this.cuadricula = cuadricula;
    }

    @Override
    public String toString() {
        return "Cuadricula{" + "cuadricula=" + cuadricula + '}';
    }
    
}
