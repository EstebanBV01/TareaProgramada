/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.LogicaDeNavegacion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ManejoInterfazGraf {
    public static final int QUESTION_MESSAGE=0;
       JOptionPane pane = new JOptionPane();
        ImageIcon icon = new ImageIcon("logo1.png");
        Cuadricula logica = new Cuadricula();
        
    public void startMenu(){
        int matrixSize = Integer.parseInt( JOptionPane.showInputDialog("seleccione el tamaño de la matriz"));
//        logica.setSize(matrixSize);
        // System.out.println(logica.matrixSize());
         logica.stringMatrix();
        int cantCells = Integer.parseInt( JOptionPane.showInputDialog("seleccione cantidad de celdas"));
        logica.posiAleatorias(cantCells);         
    }
}
