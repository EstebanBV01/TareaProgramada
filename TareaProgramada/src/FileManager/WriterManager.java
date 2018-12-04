/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;
import java.io.*;
import Game.Main;
import Crucigramas.Word;
import Crucigramas.WordList;
import javax.swing.JOptionPane;

public class WriterManager {

    private BufferedWriter writer;

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    private void write(Word Word) throws IOException {
        writer.write(Word.toFileString() + "\n");
    }

    public void writeAll() throws IOException {
        for (int i = 0; i < 2; i++) {
            write(Main.WORD_MANAGER.getWord(i));
        }
    }

    public void close() throws IOException {
        writer.close();
    }
    
    
    
    //necesito castear el objeto tipo Word a tipo String
//    public void write(String word){
//        
//        File file;
//        FileWriter fwriter;
//        BufferedWriter bufWriter;
//        PrintWriter printWriter;
//        try{
//            file=new File(word);
//            fwriter=new FileWriter(file);
//            bufWriter=new BufferedWriter(fwriter);
//            printWriter=new PrintWriter(bufWriter);
//            for (int i = 0; i < 1; i++) {
//                printWriter.write(i);
//            }            
//            printWriter.close();
//            bufWriter.close();
//        }catch(Exception e){JOptionPane.showConfirmDialog(null, "su error fue: "+e);};
//    }

}
