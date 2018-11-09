
package JuegoDeLaVida.Logico;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Datos.Celda;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 
 */
public class Reglas {
    
    
    
    /**public Cuadricula tamañoMatriz (int tamaño) {
        Celda[][] temp = new Celda[tamaño][tamaño];
         for (int f = 0; f < matrizC.getMatriz().length; f++) {
           for (int c = 0; c < matrizC.getMatriz().length; c++) {
            temp[f][c] = matrizC.getMatriz()[f][c];
           }
        } 
         matrizC.setMatriz(temp);
         return matrizC;
    }**/
 
    public void createAleatorias (int cant, Celda[][] nueva) {
       for (int f = 0; f < nueva.length; f++) {
           for (int c = 0; c < nueva.length; c++) {
                if (nueva[f][c].getEstado() == true);
                    for (int i = f; i <f+1; i++) {
                        for (int j = c; j < c+1; j++) {
                            if (nueva[f][c].getEstado() == true) {
                                JOptionPane.showMessageDialog(null,"encontro: " + j +","+ i);
                            }
                        }
                    }
            }
       }
    }
}
