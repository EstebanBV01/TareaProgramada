package Game;

import Crucigramas.WordList;
import DataBase.UserList;
import InterfazGrafica.Index;

/**
 *
 * @author juanka,fernanda,esteban
 */

public class Main {
public static WordList WORD_MANAGER = new WordList();
public static UserList User_Mananger = new UserList();//prueba el profe dijo que no//talvez no deberia ser "final"
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Index index = new Index();
        index.setVisible(true);

    }
}    

