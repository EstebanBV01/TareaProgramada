
package FileManagerBi;

import DataBase.UserList;
import Game.Main;
import java.io.*;
;


/**
 *
 * @author Esteban, Fernanda, Juan Carlos
 */
public class ReaderManagerBinary {


    //En vez del buber usa este 
    private ObjectInputStream reader;

    /**
     * Metodo para abrir en el archivo
     * @param fileName Ubicacion
     * @throws IOException 
     */
    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }
     
    /**
     * Metodo para leer el archivo binario
     * @return Retorna una lista 
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public UserList read() throws IOException, ClassNotFoundException {
        return (UserList) reader.readObject();
    }
    
//    public void readAll()throws IOException,ClassNotFoundException{
////        for (int i = 0; i < Main.User_Mananger.getLength(); i++) {
//            Main.User_Mananger.addNewUser(read());
////        }
//    }
    public void close() throws IOException {
        reader.close();
    }
}
    
    


