/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;
import Crucigramas.GridField;
import FileManager.ReaderManager;
import java.awt.GridLayout;
import java.io.*;
import Game.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */


public class Crossword extends javax.swing.JDialog {
    //una prueba de referencia a reader
ReaderManager readerTxt = new ReaderManager();
//WriterManager writerTxt = new WriterManager();
 
private static int filesCount = 1;
    /**
     * Creates new form Easy
     * constructor easy modificado con jaavax.swing
     */
     String file;

    public Crossword(javax.swing.JDialog parent, boolean modal, String file) throws IOException {    
        super(parent, modal);
        this.file = file;
        initComponents();
        setLocationRelativeTo(parent);    
        CargarPantalla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBack = new javax.swing.JButton();
        btTesting = new javax.swing.JButton();
        btClue = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        jpCross = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btBack.setText("Atras");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btTesting.setText("Comprobar");
        btTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestingActionPerformed(evt);
            }
        });

        btClue.setText("?");

        lbTitulo.setText("Nivel Fácil");

        jpCross.setBackground(new java.awt.Color(153, 51, 255));
        jpCross.setMinimumSize(new java.awt.Dimension(300, 150));
        jpCross.setPreferredSize(new java.awt.Dimension(250, 150));

        javax.swing.GroupLayout jpCrossLayout = new javax.swing.GroupLayout(jpCross);
        jpCross.setLayout(jpCrossLayout);
        jpCrossLayout.setHorizontalGroup(
            jpCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpCrossLayout.setVerticalGroup(
            jpCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btClue)
                .addGap(106, 106, 106)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btTesting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jpCross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClue)
                    .addComponent(lbTitulo))
                .addGap(4, 4, 4)
                .addComponent(jpCross, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack)
                    .addComponent(btTesting))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        if(filesCount == 1) {
            dispose();
        }else {
        filesCount--;
        dispose();
        }
    }//GEN-LAST:event_btBackActionPerformed
    ///private void 
    private void btTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestingActionPerformed

    try {
        filesCount++;
        
        Crossword cross = new Crossword(this, true, file);
        cross.setVisible(true);
        
//        if( == null) {
//            try {
//                Crossword cross = new Crossword(this, true, file);
//                cross.setVisible(true);
//            } catch (IOException ex) {
//                Logger.getLogger(Crossword.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }else {
//            filesCount = 1;
//            Levels level = new Levels(this, true);
//            level.setVisible(true);
//        }
    } catch (IOException ex) {
        Logger.getLogger(Crossword.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btTestingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btClue;
    private javax.swing.JButton btTesting;
    private javax.swing.JPanel jpCross;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
    /**
     * metodo para escojer carpeta easy,med,hard..
     * @return retorna la palabra
     */
    public String chooseLvl(){
         Levels level=new Levels(this,true);
       String dinamicFile="";
        
       switch(level.getLvlCount()){
               
               case 1:
                   dinamicFile="Easy";
               break;
               case 2:
                   dinamicFile="Medium";
                   break;
               case 3:
                   dinamicFile="Hard";
                   break;
               case 4:
                   dinamicFile="VHard";
                   break;       
       }
       return dinamicFile;
    }
    /**
     * metodo  generador dinamico de matrices
     * @return no retorna
     * @param sin parametros
     */
    
   private void CargarPantalla() throws FileNotFoundException, IOException {
       
//   System.out.println("chooselvl..."+this.chooseLvl());     
//   FileReader fr = new FileReader("CrossWordFiles/"+file+"/"+ filesCount +".txt");
FileReader fr = new FileReader("CrossWordFiles/"+file+"/"+ filesCount +".txt");
   int cols = 0;
   int rows = 0;
   String valor;
   Boolean Inicio = true;
    int i; 
    int Count = 0;
    String caracter = "";
    
    while ((i=fr.read()) != -1) {
        caracter = String.valueOf((char) i);
        if((char) i == '\n'){
           Inicio = false;
           Count = 0;
        }else {
           if (Inicio){
                if (Count == 0) cols = Integer.parseInt(caracter);
                if (Count == 2) rows = Integer.parseInt(caracter);
                for (int f = 0; f < rows; f++) {
                    for (int j = 0; j < cols; j++) {  
                        GridLayout gridLayout = new GridLayout(rows, cols);
                        GridField newTextField = new GridField();
                        newTextField.setposition(f, j);
                        gridLayout.setColumns(i);
                        newTextField.setBlack();
                        gridLayout.layoutContainer(newTextField);
                    }
                }
        }     
//        }else if(Count == 7 && caracter.equals("V")) {
//                  
//        }else if (Count == 7 && caracter.equals("H")) {
//
//        }
        Count ++;
        }
    }
//    }
//    this.readLines();
//    String[] str=new String[Main.WORD_MANAGER.getLength()];
//    
//        System.out.println(Main.WORD_MANAGER.getWord(4).getTheWord());
//        for (int j = 0; j < str.length; j++) {
//            String string = str[j];
//            str[j]=Main.WORD_MANAGER.getWord(j).getTheWord();
//        }
//        
//        GridLayout gridLayout = new GridLayout(rows, cols);
//        
//        for (int f = 0; f < rows; f++) {
//                for (int j = 0; j < cols; j++) {
//                     GridField newTextField = new GridField(f,j,1,1);
//                    jpCross.setLayout(gridLayout);
//                //    
//                newTextField.setText(str[f]);
//                //str[f]=newTextField.getText();
//                gridLayout.setHgap(2);
//                //
//                    jpCross.add(newTextField);
//                                        
//                }
        
//    GridLayout gridLayout = new GridLayout(rows, cols);
//        //panelGlayout.setLayout(grid);//esto lo substituye el gridLayout??
//
//            for (int f = 0; f < rows; f++) {
//                for (int j = 0; j < cols; j++) {
//                     GridField newTextField = new GridField(f,j,1,1);
//                    jpCross.setLayout(gridLayout);
//                        gridLayout.addLayoutComponent("" + caracter, newTextField);
//                }
//            }
//        System.out.println("UNa prueba...."+str[0]);
 }

    
    /**
     * metodo void para iniciar
     */
    private void initPanel() {
        ReaderManager reader=new ReaderManager();
        int cols = 5;
        int rows = 6;
        this.readLines();
        
        GridLayout gridLayout = new GridLayout(rows, cols);
        //panelGlayout.setLayout(grid);//esto lo substituye el gridLayout??

            for (int f = 0; f < rows; f++) {
                for (int j = 0; j < cols; j++) {
//                     GridField newTextField = new GridField(f,j,1,1);
                    jpCross.setLayout(gridLayout);
                    for (int i = 0; i < gridLayout.getColumns(); i++) {
                        gridLayout.addLayoutComponent("", this);
                    }
                        
                    
//                    jpCross.add(newTextField);
                    //gridLayout.addLayoutComponent("asd", newTextField);
                    
                }
            }
    }
    
        /**
        * Metodo para leer los archivos txt y sus elementos 
        */
    public void readLines(){
        ReaderManager readerTxt = new ReaderManager();
        try {
            readerTxt.open("CrossWordFiles/"+file+"/"+ filesCount +".txt");//carpeta easy debe ser variable
            readerTxt.readAll();
            readerTxt.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa de TEXTO en reader");
        } catch (IOException ex) {
            System.err.println("error de archivo TEXTO en reader");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }
    /**
     * metodo para convertir a String
     */
    public void load() throws IOException{
   
   
   String cols;
   String rows;
   Boolean Inicio = true;
   String i; 
   int Count = 0;
   String inicio;
   String element;
   
   
        try {
            File cross;
            FileReader fr = new FileReader("CrossWordFiles/"+file+"/"+ filesCount +".txt"); 
            BufferedReader br = null;
            String[] lectura;
            String caracter = "";
            while((caracter = br.readLine())!= null) {
                lectura = caracter.split("/");
                inicio = lectura[3];
                element = lectura[4];
                rows = lectura[1];
                cols = lectura[0];
                
                if(inicio.equals("H")) {
                    
                }
                
                if(inicio.equals("V")) {
                    
                }
            }
        } catch (Exception e) {
        }
    }
}
