/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;

/**
 *
 * @author juanka,fernanda,esteban
 */
public class Word {
    private int wordNumber;
    private String vertHoriz;
    private int filaSalida;
    private int filaLLegada;
    private int coluSalida;
    private int coluLlegada;
    //
    private String word;

    public Word(int wordNumber, String vertHoriz, int filaSalida, int filaLLegada, int coluSalida, int coluLlegada,String word) {
        this.wordNumber = wordNumber;
        this.vertHoriz = vertHoriz;
        this.filaSalida = filaSalida;
        this.filaLLegada = filaLLegada;
        this.coluSalida = coluSalida;
        this.coluLlegada = coluLlegada;
        this.word=word;
    }
    public Word(){
    this(0,"",0,0,0,0,"");
    }

    public String getWordObj(int index) {
        return word;
    }

    @Override
    public String toString() {
        return "Word{"+word + ", wordNumber=" + wordNumber + ", vertHoriz=" + vertHoriz + ", filaSalida=" + filaSalida + ", filaLLegada=" + filaLLegada + ", coluSalida=" + coluSalida + ", coluLlegada=" + coluLlegada+ '}';
    }
    public String toFileString(){
        return ""+word+"-"+wordNumber+"-"+filaSalida+"-"+filaLLegada+"-"+coluSalida+"-"+coluLlegada+"-"+vertHoriz;
    
    }
}
