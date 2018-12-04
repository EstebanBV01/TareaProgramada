
package FileManagerBi;

import DataBase.User;
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

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }
     

    public User read() throws IOException, ClassNotFoundException {
        return (User) reader.readObject();
    }
    public void readAll()throws IOException,ClassNotFoundException{
        for (int i = 0; i < Main.User_Mananger.getLength() ; i++) {
           read();
        }
    }
    public void close() throws IOException {
        reader.close();
    }
}
    
    


