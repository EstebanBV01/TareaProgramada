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
    private int filaSalida;
    private int filaLLegada;
    private int coluSalida;
    private int coluLlegada;
    private String description;
    //
    private String word;
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
        this.word=word;
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
        this.word=word;
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
        return "Word{"+word +filaSalida+"/"+coluSalida+"/"+wordNumber+"/"+vertHoriz+"/"+word+"/"+description;
    }
    public String toFileString(){
        return filaSalida+"/"+coluSalida+"/"+wordNumber+"/"+vertHoriz+"/"+word+"/"+description;
    
    }
}
