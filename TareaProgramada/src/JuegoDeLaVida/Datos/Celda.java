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
    private int viva = 1;
    private int muerta = 0;
    
     public Celda( int viva, int muerta){
            this.viva=viva;
            this.muerta=muerta;
    }
      public Celda( int viva){
            this.viva=viva;
            //this.muerta=muerta;
    }
      public Celda () {
        this(0,0);   
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
    

}
