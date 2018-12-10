
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
    
    /**
     * Metodo para abrir el archivo
     * @param fileName ubicacion 
     * @throws IOException captura de error
     */
    public void open (String fileName) throws IOException {
        writer = new ObjectOutputStream(new FileOutputStream(fileName));
    }
    
    /**
     * Metodo para escribir en un archivo binario
     * @param _UserList Una lista de usuarios
     * @throws IOException caprtura de errores
     */
    public void write (UserList _UserList) throws IOException {
        writer.writeObject(_UserList);
    }
    
    /**
     * Metodo para cerrar el archivo
     * @throws IOException 
     */
    public void close() throws IOException {
        writer.close();
    }
    
}


