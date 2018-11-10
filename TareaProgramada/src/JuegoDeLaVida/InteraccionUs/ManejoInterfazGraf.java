
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.Reglas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 */
public class ManejoInterfazGraf {
        int count = 1;
        ImageIcon icontest = new ImageIcon("logo1.jpg");
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
        boolean decision=true;
        public void startGame () {
            
           //int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
           int valor = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Tamaño De El Juego", "Juego De La Vida", JOptionPane.INFORMATION_MESSAGE, icontest, new Integer[] {8,9,10,11,12,13,14,15,16,17,18,19,20}, null));
            Cuadricula cuadri = new Cuadricula(valor);
            reglasGame.fillMatrix(cuadri.getMatriz());
            
            int celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
            cuadri.random(celdasAle);

            do {
                 int fila=Integer.parseInt(JOptionPane.showInputDialog("Digite La Fila Que Desea"));
            int col=Integer.parseInt(JOptionPane.showInputDialog("Digite La Columna Que Desea"));
                cuadri.setPositions(fila, col);
                logic.stringMatrix(cuadri.getMatriz());
                decision = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea añadir otra? \n[true] Para Si! \n[false] Para No!"));               
            } while (decision == true); 
            while (count <= 20) {
                logic.stringMatrix(cuadri.getMatriz());
                reglasGame.encuentraVivos(cuadri.getMatriz());
                //reglasGame.Rules(cuadri.getMatriz());
                count += 1;
            } 
        }  
    }

