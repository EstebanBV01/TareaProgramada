/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class LogicaDeNavegacion {
    
 public void stringMatrix(Celda[][] nueva){
     
        String cadena = "";
        for (int f = 0; f < nueva.length; f++) {
            for (int c = 0; c < nueva.length; c++) {
               
                if(nueva[f][c].getEstado() == true )
                {
//                    cadena += nueva[f][c]+" | ";
                    cadena += "⬛" +" | ";
                }
                else
                {
                    cadena += "□" +" | ";
                }
                
            }
            cadena += "\n";
        }
        JOptionPane.showMessageDialog(null,cadena+"\n");
       }
}
