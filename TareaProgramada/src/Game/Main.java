package Game;

import Crucigramas.Word;
import DataBase.User;
import DataBase.UserInformation;
import FileManagerBi.ReaderManagerBinary;
import FileManagerBi.WriterManagerBinary;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
//        Word w1=new Word(0, 0, 0,"V","laPalabra", "laDescripcion");
//        Index index = new Index();
//        index.setVisible(true);
//        Word[] vec={w1,w1,w1};
//        Word word=new Word(vec);
//        System.out.println(word.getListString());
//        System.out.println("** "+vec[1].toFileString());
        
        
        
        
        User user1 = new User("Master131415", "1234");
        User user2 = new User("LolitoComunica", "BakaMañanera123");
        
        
        User_Mananger.addUser(user1);
        User_Mananger.addUser(user1);
        User_Mananger.addUser(user2);
        System.out.println("****"+User_Mananger.getListString());
        
        
        
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
////        WriterManager writer = new WriterManager();
//        try {
//            writer.open("personFile.ser");
//            writer.write(person1);
//            writer.write(person2);
//            writer.write(person3);
//            writer.write(person4);
//            writer.close(); //importante cerrar el archivo 
//            System.out.println("Escritura exitosa");
//        } catch (IOException ex) {
//            System.err.println("error de archivo");
//            System.err.println(ex.getMessage());
//            ex.printStackTrace();
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
