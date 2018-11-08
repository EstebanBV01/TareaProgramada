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
    private int viva;
    private int muerta;
    
     public Celda () {
        this(1, 0);   
    }
    
     public Celda(int muerta, int viva){
            this.viva=viva;
            this.muerta=muerta;
    }
     
    public int getViva() {
        return viva;
    }

    public int getMuerta() {
        return muerta;
    }

    public void setViva(int viva) {
        this.viva = viva;
    }

    public void setMuerta(int muerta) {
        this.muerta = muerta;
    }

    @Override
    public String toString() {
        return "Celda{" + "viva=" + viva + ", muerta=" + muerta + '}';
    }
    
    public int getEstado (int estado) {
        if (estado == 1) {
            estado = this.viva;
        }else if (estado == 0) {
            estado = this.muerta;
        }
        return estado;
    }
    

}
