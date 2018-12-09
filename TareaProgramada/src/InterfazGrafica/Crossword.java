/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;
import Crucigramas.GridField;
import Crucigramas.Word;
import Crucigramas.WordList;//talvez no sea necesatrio
import FileManager.ReaderManager;
import FileManager.WriterManager;
import java.awt.GridLayout;
import java.io.*;
import Game.Main;
import java.awt.LayoutManager;
import javafx.scene.control.TextField;
/**
 *
 * @author usuario
 */


public class Crossword extends javax.swing.JDialog {
    //una prueba de referencia a reader
ReaderManager readerTxt = new ReaderManager();
//WriterManager writerTxt = new WriterManager();
    /**
     * Creates new form Easy
     * constructor easy modificado con jaavax.swing
     */
    public Crossword(javax.swing.JDialog parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);    
        CargarPantalla();
//        initPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        dispose();
    }//GEN-LAST:event_btBackActionPerformed
    ///private void 
    private void btTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTestingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btClue;
    private javax.swing.JButton btTesting;
    private javax.swing.JPanel jpCross;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
    
    
    /**
     * metodo  generador dinamico de matrices
     * @return no retorna
     * @param sin parametros
     */
    
    private void CargarPantalla() throws FileNotFoundException, IOException {
FileReader fr = new FileReader("C:\\Users\\Satellaizar\\Documents\\NetBeansProjects\\TareaProgramada\\TareaProgramada\\CrossWordFiles\\Easy\\11.txt"); 
   int cols = 0;
   int rows = 0;
   Boolean Inicio = true;
    int i; 
    int Count = 0;
    String caracter = "";
    
    while ((i=fr.read()) != -1) 
        
        if((char) i == '\n'){
           Inicio = false;
           Count = 0;
        }else {
                if (Inicio){
       caracter = String.valueOf((char) i);
       if (Count == 0) cols = Integer.parseInt(caracter);
       if (Count == 2) rows = Integer.parseInt(caracter);
              
//    cols = (int)char i.charValue();
        
        
    }
    
    Count ++;
  
    }
    
    GridLayout gridLayout = new GridLayout(rows, cols);
    for (int f = 0; f < rows; f++) {
                for (int j = 0; j < cols; j++) {
                     GridField newTextField = new GridField(f,j,1,1);
                    jpCross.setLayout(gridLayout);
                    jpCross.add(newTextField);
                    //gridLayout.addLayoutComponent("asd", newTextField);
                    
                }
            }
        }

            
    
    private void initPanel() {
        ReaderManager reader=new ReaderManager();
        int cols = 5;
        int rows = 6;
        this.readLines();
        
        GridLayout gridLayout = new GridLayout(rows, cols);
        //panelGlayout.setLayout(grid);//esto lo substituye el gridLayout??

            for (int f = 0; f < rows; f++) {
                for (int j = 0; j < cols; j++) {
                     GridField newTextField = new GridField(f,j,1,1);
                    jpCross.setLayout(gridLayout);
                    jpCross.add(newTextField);
                    //gridLayout.addLayoutComponent("asd", newTextField);
                    
                }
            }
    }
        /**
        * 
        */
    public void readLines(){
        ReaderManager readerTxt = new ReaderManager();
        try {
            int var=1;
            readerTxt.open("CrossWordFiles/Easy/1.txt");//carpeta easy debe ser variable
            readerTxt.readAll();
            readerTxt.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa de TEXTO en reader");
        } catch (IOException ex) {
            System.err.println("error de archivo TEXTO en reader");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }
}