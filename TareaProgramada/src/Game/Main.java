package Game;

import Crucigramas.Word;
import DataBase.User;
import DataBase.UserInformation;
import FileManagerBi.ReaderManagerBinary;
import FileManagerBi.WriterManagerBinary;
import InterfazGrafica.Index;


/**
 *
 * @author juanka,fernanda,esteban
 */
import java.io.*;
public class Main {
public final static Word WORD_MANAGER = new Word();
public final static UserInformation User_Mananger=new UserInformation();//prueba el profe dijo que no//talvez no deberia ser "final"
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Index index = new Index();
        index.setVisible(true);

        
        
        
        
        User user1 = new User("Master131415", "1234");
        User user2 = new User("LolitoComunica", "BakaMañanera123");
        
        
        User_Mananger.addUser(user1);
        User_Mananger.addUser(user1);
        User_Mananger.addUser(user2);
        System.out.println("****"+User_Mananger.getListString());
        
        
        /**
         * Impresion binaria de archivos de la lista de usuarios
         */
        ReaderManagerBinary reader = new ReaderManagerBinary();
        try {
            reader.open("UserFiles/UserInfo.ser");
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());
            System.out.println(reader.read());
            reader.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.err.println("error de casteo de objeto del archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
        
        
        WriterManagerBinary writer = new WriterManagerBinary();
        try {
            writer.open("UserFiles/UserInfo.ser");
            writer.writeAll();
            //writer.write(user1);
            writer.close();
            System.err.println("Escritura Exitosa");
        }catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        WriterManager writer = new WriterManager();
//        try {
//            writer.open("UserFiles/UserInfo.ser");  //probar el parametro apend en new FileWriter(fileName, true)
//            writer.writeAll();
//            writer.close(); //importante cerrar el archivo
//            System.out.println("Escritura exitosa");
//        } catch (IOException ex) {
//            System.err.println("error de archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
    
        
        
        
//        WriterManager writer = new WriterManager();
//        try {
//            writer.open("UserFiles/UserInfo.ser");  //probar el parametro apend en new FileWriter(fileName, true)
//            writer.writeAll();
//            writer.close(); //importante cerrar el archivo 
//            System.out.println("Escritura exitosa");
//        } catch (IOException ex) {
//            System.err.println("error de archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
    }
    
}
