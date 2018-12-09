
package FileManagerBi;


import DataBase.UserList;
import Game.Main;
import java.io.FileOutputStream;
import java.io.*;
import java.io.ObjectOutputStream;

/**
 *
 * @author Esteban, Fernanda, Juan Carlos
 */
public class WriterManagerBinary {
    
    private ObjectOutputStream writer;
    
    public void open (String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }
    
    public void write (UserList _UserList) throws IOException {
        writer.writeObject(_UserList);
    }
    
//    public void writeAll() throws IOException {
//        for (int i = 0; i < Main.User_Mananger.getLength()-1; i++) {
//            write(Main.User_Mananger.getUser(i));
//        }
//    }
    
    public void close() throws IOException {
        writer.close();
    }
    
}


