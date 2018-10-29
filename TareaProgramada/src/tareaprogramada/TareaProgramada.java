
package tareaprogramada;

import javax.swing.JOptionPane;

/**
 *
 * @author EstebanBV
 * @version 28/10/2018
 */
public abstract class TareaProgramada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LogicaDeNavegacion juego=new LogicaDeNavegacion();
      //int matrixSize=Integer.parseInt( JOptionPane.showInputDialog("digite el tamaño de la cuadricula"));
       juego.setTam(7);
       JOptionPane.showMessageDialog(null,juego.getTamaño());
       //JOptionPane.showMessageDialog(null,juego.imprimirMatrix());
        juego.iniciaJuego();
      JOptionPane.showMessageDialog(null,juego.getTamaño());
    
    
    
    }
    
}
