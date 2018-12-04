
package FileManagerBi;


import DataBase.User;
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
    
    public void write (User user) throws IOException {
        writer.writeObject(user);
    }
    
    public void close() throws IOException {
        writer.close();
    }
    
}

//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class WriterManager {
//
//    private ObjectOutputStream writer;
//
//    public void open(String fileName) throws IOException {
//        writer = new ObjectOutputStream(new FileOutputStream(fileName));
//    }
//
//    public void write(Person person) throws IOException {
//        writer.writeObject(person);
//    }
//
//    public void close() throws IOException {
//        writer.close();
//    }
//}
