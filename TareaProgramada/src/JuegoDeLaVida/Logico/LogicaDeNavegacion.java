/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Logico;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class LogicaDeNavegacion {
    private Celda[][] cells = {};
    private Celda activa;
    private final Cuadricula matrizGame = new Cuadricula(cells);
    //matodos comunes
    public Celda[][] posiAleatorias(int cantDeCeldas){
        int aleatorio=0,aleatorio2=0;
         int max = 9; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio=(int)(Math.random() * range) + min;
            aleatorio2 = (int)(Math.random() * range) + min;
                this.cells[aleatorio][aleatorio2]=activa; 
        }
        return this.cells;
    }
   
    public void iniciaJuego(){
        boolean desicion;
        int cantCeldas=Integer.parseInt( JOptionPane.showInputDialog("seleccione cantidad de celdas"));
        this.posiAleatorias(cantCeldas);    
        do {            
            
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
