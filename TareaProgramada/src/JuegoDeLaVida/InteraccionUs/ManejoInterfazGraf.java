
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.Reglas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 9/11/2018
 */

/**
 * Metodo creado para inicar el juego con sus devidas funciones 
 * 
 */

public class ManejoInterfazGraf {
        int count = 1;
        ImageIcon icontest = new ImageIcon("logo1.jpg");
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
        boolean decision=true;
        int opcion=0;
        public void startGame () {           
            
           int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
           Cuadricula cuadri = new Cuadricula(valor);
            reglasGame.fillMatrix(cuadri.getMatriz());
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "digite 1 para asignar posiciones aleatorias\n"
                                                                            + "digite 2 para asignarlas manualmente"));
            switch(opcion){
                case 1:
                    int celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
                    cuadri.random(celdasAle);
                break;
                case 2:
                    do {
                        int fila=Integer.parseInt(JOptionPane.showInputDialog("Digite La Fila Que Desea"));
                        int col=Integer.parseInt(JOptionPane.showInputDialog("Digite La Columna Que Desea"));
                        cuadri.setPositions(fila, col);
                        logic.stringMatrix(cuadri.getMatriz());
                        decision = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea añadir otra? \n[true] Para Si! \n[false] Para No!"));               
                    }while (decision == true);
                break;
            }  
            
               while (count <= 20) {
                  logic.stringMatrix(reglasGame.Rules(cuadri.getMatriz()));
                  cuadri.setMatriz(reglasGame.Rules(cuadri.getMatriz()));
                count += 1;
            } 
        }  
    }

