/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Logico;

import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class LogicaDeNavegacion {
   private int [][] celda;
    private int tam;
    public void setTam(int tam) {
        this.tam = tam;
    } 
    public LogicaDeNavegacion(){
        //para probar voy a asignar el tamaño del aray de una vez
        celda=new int[10][10];
    }
    
    public LogicaDeNavegacion(int[][] celda,int tam) {
        this.celda = celda;
        this.tam = tam;
    }
    
    //matodos comunes

    private void setMatrixSize(int tama){
           int[][] celda2=new int[tama][tama];
            for (int f = 0; f < celda.length; f++) {
                for (int c = 0; c < celda.length; c++) {
                celda2[f][c]=this.celda[f][c];
                }
            this.celda=celda2;
            }
    }
    public String imprimirMatrix(){
        String cadena="";
        for (int f = 0; f < celda.length; f++) {
            for (int c = 0; c < celda.length; c++) {
              cadena+=celda[f][c]+"   ||   ";
            }
            cadena+="\n";
            
        }
        return cadena;
    }
    public int getTamaño(){
    return celda.length;
    }
      ///////////////////////
    public int[][] posiAleatorias(int cantDeCeldas){
        int aleatorio=0,aleatorio2=0;
         int max = 9; 
        int min = 0; 
        int range = max - min + 1;
        for (int i = 0; i < cantDeCeldas; i++) {
            aleatorio=(int)(Math.random() * range) + min;
            aleatorio2 = (int)(Math.random() * range) + min;
                this.celda[aleatorio][aleatorio2]=1; 
        }
        return this.celda;
    }
    public void asignarCelda(int fila,int col){
        this.celda[fila][col]=1;
    }
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
