package Game;

import Crucigramas.Word;
import Crucigramas.WordList;
import DataBase.User;
import DataBase.UserList;
import FileManager.ReaderManager;
import FileManager.WriterManager;
import FileManagerBi.ReaderManagerBinary;
import FileManagerBi.WriterManagerBinary;
import InterfazGrafica.Index;


/**
 *
 * @author juanka,fernanda,esteban
 */
import java.io.*;
public class Main {
public static WordList WORD_MANAGER = new WordList();
public static UserList User_Mananger = new UserList();//prueba el profe dijo que no//talvez no deberia ser "final"
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
//        ReaderManagerBinary reader = new ReaderManagerBinary();
//        try {
//            reader.open("UserFiles/UserInfo.ser");
//            System.out.println(reader.read());
//            System.out.println(reader.read());
//            System.out.println(reader.read());
//            System.out.println(reader.read());
//            reader.close(); //importante cerrar el archivo
//            System.out.println("Lectura exitosa bianria en reader");
//        } catch (IOException ex) {
//            System.err.println("error de archivo binario en reader");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            System.err.println("error de casteo de objeto del archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
        
        /**
         * escritura binaria para el usuario
         */
//        WriterManagerBinary writer = new WriterManagerBinary();
//        try {
//            writer.open("UserFiles/UserInfo.ser");
//            writer.writeAll();
//            //writer.write(user1);
//            writer.close();
//            System.out.println("Escritura Exitosa binaria en writer");
//        }catch (IOException ex) {
//            System.err.println("error de archivo binario en writer");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
        System.out.println("----------------------\n"
                + "-----------------------------");
       ////
        ////
        ///prueba de lectura escritura de TEXT
        ////
        Word w1=new Word(0, 0, 0, "V", "la palabrea", "la descripcion");
        WORD_MANAGER.addWord(w1);
        WORD_MANAGER.addWord(w1);
        WORD_MANAGER.addWord(w1);
        WORD_MANAGER.addWord(w1);
        WORD_MANAGER.addWord(w1);
        WORD_MANAGER.addWord(w1);
        
      
        System.out.println("counterWord="+WORD_MANAGER.getLength());
        System.out.println(WORD_MANAGER.getListString());
            
        ReaderManager readerTxt = new ReaderManager();
        try {
            readerTxt.open("CrossWordFiles/Easy/1.txt");
            System.out.println(readerTxt.read());//creo que aqui va un while + arraycopy
            System.out.println(readerTxt.read());
            System.out.println(readerTxt.read());
            System.out.println(readerTxt.read());
            readerTxt.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa de texto en reader");
        } catch (IOException ex) {
            System.err.println("error de archivo texto en reader");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }

        WriterManager writerTxt = new WriterManager();
        try {
            writerTxt.open("CrossWordFiles/Easy/1.txt");  //probar el parametro apend en new FileWriter(fileName, true)
            writerTxt.writeAll();
            writerTxt.close(); //importante cerrar el archivo 
            System.out.println("Escritura exitosa texto en writer");
        } catch (IOException ex) {
            System.err.println("error de archivo texto en writer");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }

}
    

