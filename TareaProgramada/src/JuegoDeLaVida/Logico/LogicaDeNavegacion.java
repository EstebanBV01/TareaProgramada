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
    private Celda[][] cells;
    private Celda activa;
   // private final Cuadricula matrizGame = new Cuadricula(cells);
    //matodos comunes
    
    public Celda[][] posiAleatorias(int cantDeCeldas){
        int aleatorio=0,aleatorio2=0;
         int max = 3; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.cells[aleatorio][aleatorio2]=activa; 
        }
        return this.cells;
    }
    private void matrixSize(int size){
           Celda[][] vector2=new Celda[cells.length*2][cells.length];
            for (int i = 0; i < cells.length; i++) {
                vector2[i]=this.cells[i];
        }
            this.cells=vector2;
    }
    public void rule1(){
        boolean desicion;
        do {            
            
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
