/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprogramada;

import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class LogicaDeNavegacion {
   private int [][] celda;
    private int tam;
    private int fila,columna;
    public void setTam(int tam) {
        this.tam = tam;
    } 
    public LogicaDeNavegacion(){
        celda=new int[tam][tam];
    }
    
    public LogicaDeNavegacion(int[][] celda, int tam, int fila, int columna) {
        this.celda = celda;
        this.tam = tam;
        this.fila = fila;
        this.columna = columna;
    }
    
    //matodos comunes

    private void setMatrixSize(int tama){
           int[][] matrix2=new int[tama][tama];
            for (int f = 0; f < celda.length; f++) {
                for (int c = 0; c < celda.length; c++) {
                matrix2[f][c]=this.celda[f][c];
                }
            this.celda=matrix2;
            }
    }
    public void setCelda() {
        int uno=1;
       celda[fila][columna]=uno;
    }
    public String imprimirMatrix(){
        String cadena="";
        for (int f = 0; f < celda.length; f++) {
            for (int c = 0; c < celda.length; c++) {
              cadena+=celda[f][c]+" || ";
            }
            cadena+="\n";
            
        }
        return cadena;
    }
    public int getTamaño(){
    return celda.length;
    }
      ///////////////////////
    public void iniciaJuego(){
        boolean desicion;
        this.setMatrixSize(tam=Integer.parseInt( JOptionPane.showInputDialog("ingrese tamaño del arreglo")));
        
        do {            
          fila=Integer.parseInt( JOptionPane.showInputDialog("seleccione posicion-fila"));
          columna=Integer.parseInt( JOptionPane.showInputDialog("seleccione posicion-columna")); 
            JOptionPane.showMessageDialog(null,this.imprimirMatrix());
          desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea continuar true/false"));
            
        }while (desicion==true);
    }
}
