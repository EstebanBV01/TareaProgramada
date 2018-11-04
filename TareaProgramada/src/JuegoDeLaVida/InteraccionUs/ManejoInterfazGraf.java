/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Logico.LogicaDeNavegacion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ManejoInterfazGraf {
    public static final int QUESTION_MESSAGE=0;
       JOptionPane pane=new JOptionPane();
        ImageIcon icon = new ImageIcon("logo1.png");
        LogicaDeNavegacion logica=new LogicaDeNavegacion();
    public void startMenu(){
       // int matrixSize=Integer.parseInt( JOptionPane.showInputDialog("seleccione el tamaño de la matriz"));
        //logica.matrixSize(matrixSize);
        int cantCells=Integer.parseInt( JOptionPane.showInputDialog("seleccione cantidad de celdas"));
        
        logica.posiAleatorias(cantCells);
        JOptionPane.showConfirmDialog(pane, pane, "prueba1", QUESTION_MESSAGE);
        
        int a=JOptionPane.showConfirmDialog(pane, icon, "", QUESTION_MESSAGE, QUESTION_MESSAGE, icon);    
    }
}
