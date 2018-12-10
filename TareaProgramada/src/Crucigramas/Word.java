/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;
import java.io.*;

/**
 *
 * @author juanka,fernanda,esteban
 */
public class Word implements Serializable {
    private int tama;
///////////////
    private int wordNumber;
    private String vertHoriz;
    //
    private int filaSalida;
    private int filaLLegada;
    private int coluSalida;
    private int coluLlegada;
    private String description;
    //
    private String theWord;
/**
     * constructor con todos los atributos 
     * @param wordNumber
     * @param vertHoriz
     * @param filaSalida
     * @param filaLLegada
     * @param coluSalida
     * @param coluLlegada
     * @param word 
     */
    public Word(int filaSalida ,int coluSalida,int wordNumber, String vertHoriz,String word,String descri,int filaLlegada,int coluLlegada) {
        this.wordNumber = wordNumber;
        this.vertHoriz = vertHoriz;
        this.filaSalida = filaSalida;
        this.filaLLegada = filaLlegada;
        this.coluSalida = coluSalida;
        this.coluLlegada = coluLlegada;
        this.theWord=word;
    }/**
     * constructor con menos atributos
     * @param wordNumber
     * @param vertHoriz
     * @param filaSalida
     * @param filaLLegada
     * @param word 
     * @param description
     */
     public Word( int filaSalida ,int coluSalida,int wordNumber, String vertHoriz,String word,String descri) {
        this.wordNumber = wordNumber;
        this.vertHoriz = vertHoriz;
        this.filaSalida = filaSalida;
        this.coluSalida = coluSalida;
        this.description=descri;
        this.theWord=word;
    }
     /**
      * 
      * @param fiilaSalida
      * @param filaCol 
      */
     public Word(int tamañ){
     this.tama=tamañ;
     }
    /*
    constructor sin parametros
    */
    public Word(){
    this(0, 0,0,"","","",0, 0);
  }    
    @Override
    public String toString() {
        return filaSalida+"/"+coluSalida+"/"+wordNumber+"/"+vertHoriz+"/"+theWord+"/"+description;
    }
    public String toFileString(){
        return filaSalida+"/"+coluSalida+"/"+wordNumber+"/"+vertHoriz+"/"+theWord+"/"+description;
    
    }
    
    /**
     * Metodo para obtener el tamaño del vector
     * @return int tamaño
     */
    public int getTama() {
        return tama;
    }

    /**
     * Metodo para obtener un int aparir de las letras
     * @return letras
     */
    public int getWordNumber() {
        return wordNumber;
    }

    /**
     * Metodo para obtener un String vertical
     * @return Un String
     */
    public String getVertHoriz() {
        return vertHoriz;
    }
    
    /**
     * Metodo para obtener el numero de fila
     * @return Un int
     */
    public int getFilaSalida() {
        return filaSalida;
    }

    /**
     * Mtdoo para obtener una columna
     * @return Un int
     */
    public int getColuSalida() {
        return coluSalida;
    }

    /**
     * Metodo para obtener Las pistas
     * @return Un String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metodo para obtener la palabra
     * @return Un String
     */
    public String getTheWord() {
        return theWord;
    }
    
}
