
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.Reglas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import JuegoDeLaVida.Datos.Celda;

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
    
        private int count = 1;
        private boolean decision=true;
        private int opcion = 0;
        private int celdasAle=0;
        private int valor=0;
        private ImageIcon icontest = new ImageIcon("logo1.png");
        private Reglas reglasGame = new Reglas();
        private LogicaDeNavegacion logic = new LogicaDeNavegacion();
        private Object [] colores ={"si","no"}; 
        private Cuadricula[][] vector = new Cuadricula[21][21];
        
        
        public void startGame () {
             JOptionPane.showMessageDialog(null,  "Bienvenido Al Juego De La Vida\nAutores:\nMaria Fernanda Alvarado Astorga\nJuan Carlos Valverde Araya\nEsteban Barrantes Vargas ", "Juego De La Vida", JOptionPane.INFORMATION_MESSAGE, icontest);
            do{  
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego...> 8 y < 20"));
            }while(valor<8||valor>20);
            Cuadricula cuadri = new Cuadricula(valor);
            reglasGame.fillMatrix(cuadri.getMatriz());
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "digite 1 para asignar posiciones aleatorias\n"
                                                                            + "digite 2 para asignarlas manualmente"));
            switch(opcion){
                case 1:
                     celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
                    cuadri.random(celdasAle);                 
                break;
                case 2:
                    do {
                        int fila=Integer.parseInt(JOptionPane.showInputDialog("Digite La Fila Que Desea"));
                        int col=Integer.parseInt(JOptionPane.showInputDialog("Digite La Columna Que Desea"));
                        cuadri.setPositions(fila, col);
                        logic.stringMatrix(cuadri.getMatriz());
                        decision = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea Añadir Otra Celda? \n[true] Para Si! \n[false] Para No!"));               
                    }while (decision == true);
                break;
            }  
            //////////////////
            do{                    
                logic.stringMatrix(reglasGame.Rules(cuadri.getMatriz()));
                reglasGame.encuentraVivos(cuadri.getMatriz());
                cuadri.setMatriz(reglasGame.Rules(cuadri.getMatriz()));
                JOptionPane.showMessageDialog(null,"Hay: "+reglasGame.encuentraVivos(cuadri.getMatriz())+" Cedas Vivas");
                decision = Boolean.parseBoolean(JOptionPane.showInputDialog("desea volver a jugar?\n[true] [false]"));               
              //decision = Boolean.parseBoolean((String) JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,colores, colores[0]));
                count += 1;
            }while(decision==true); 
              JOptionPane.showMessageDialog(null,"Gracias Por Jugar!");
        }  
    }

