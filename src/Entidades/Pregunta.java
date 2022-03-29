/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author saymo
 */
public class Pregunta {
    private String pregunta, r1, r2, r3, rCorrecta;
    private int posCorrecta;
    public Pregunta() {
    }

    public Pregunta(String pregunta, String r1, String r2, String r3, String rCorrecta, int posCorrecta) {
        this.pregunta = pregunta;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.rCorrecta = rCorrecta;
        this.posCorrecta = posCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getrCorrecta() {
        return rCorrecta;
    }

    public void setrCorrecta(String rCorrecta) {
        this.rCorrecta = rCorrecta;
    }

    public int getPosCorrecta() {
        return posCorrecta;
    }

    public void setPosCorrecta(int posCorrecta) {
        this.posCorrecta = posCorrecta;
    }

    @Override
    public String toString() {        
        switch(posCorrecta){
            case 1:
                return pregunta + '|' + rCorrecta + "*|" + r1 + '|' + r2 + '|' + r3 + '|';                
            case 2:
                return pregunta + '|' + r1 + '|' + rCorrecta + "*|" + r2 + '|' + r3 + '|';                     
            case 3:
                return pregunta + '|' + r1 + '|' + r2 + '|' + rCorrecta + "*|"  + r3 + '|';                                     
            default:
                return pregunta + '|' + r1 + '|' + r2 + '|' + r3 + '|' + rCorrecta + "*|"  ;                 
        }
    }        
}
