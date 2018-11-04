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
    private String viva="X";
    private String muerta="O";
     public Celda(String viva,String muerta){
            this.viva=viva;
            this.muerta=muerta;
    }
      public Celda () {
        this("","");   
    }
    public String getViva() {
        return viva;
    }

    public String getMuerta() {
        return muerta;
    }

    public void setViva(String viva) {
        this.viva = viva;
    }

    public void setMuerta(String muerta) {
        this.muerta = muerta;
    }

    @Override
    public String toString() {
        return "Celda{" + "viva=" + viva + ", muerta=" + muerta + '}';
    }
    

}
