
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
        int count = 0;
        ImageIcon icontest = new ImageIcon("logo1.jpg");
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
        boolean decision=true;
        public void startGame () {
            
            
            int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
            Cuadricula cuadri = new Cuadricula(cant);
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
            do {
                logic.stringMatrix(cuadri.getMatriz());
                reglasGame.encuentraVivos(cuadri.getMatriz());
                count += 1;
            } while (count == 20);
  
        }  
    }

