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
    private final Cuadricula matrizGame = new Cuadricula(cells);
    //matodos comunes

    
    
    
      ///////////////////////
    //public int[][] posiAleatorias(int cantDeCeldas){
      //  int aleatorio=0,aleatorio2=0;
        // int max = 9; 
        //int min = 0; 
        //int range = max - min + 1;
        //for (int i = 0; i < cantDeCeldas; i++) {
          // aleatorio=(int)(Math.random() * range) + min;
           // aleatorio2 = (int)(Math.random() * range) + min;
             //   this.celda[aleatorio][aleatorio2]=1; 
        //}
        //return this.celda;
    //}
   
    public void iniciaJuego(){
        boolean desicion;int fila,col;
        int cantCeldas=Integer.parseInt( JOptionPane.showInputDialog("seleccione cantidad de celdas"));
        this.posiAleatorias(cantCeldas);
        
        do {            
          fila=Integer.parseInt( JOptionPane.showInputDialog("seleccione posicion-fila"));
          col=Integer.parseInt( JOptionPane.showInputDialog("seleccione posicion-columna"));
          this.asignarCelda(fila, col);
          JOptionPane.showMessageDialog(null,this.imprimirMatrix());
          desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
