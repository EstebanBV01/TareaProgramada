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
    
    private Celda viva;
    private Celda muerta;
    Cuadricula logica = new Cuadricula(0);
   
     public void estado () {
        for (int f = 0; f < logica.matrixSize(); f++) {
            for (int c = 0; c < logica.matrixSize(); c++) {
                if (logica.[f][c] == viva) {
                    
                }
            }
        }
    }

     public Celda[][] posiAleatorias(int cantDeCeldas){
        int aleatorio = 0 ,aleatorio2 = 0 ;
        int max = celda.length-1; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
           aleatorio  = (int)(Math.random() * range) + min;
           aleatorio2 = (int)(Math.random() * range) + min;
                this.celda[aleatorio][aleatorio2] = viva; 
        }
        return this.celda;
    }
    
  
}
