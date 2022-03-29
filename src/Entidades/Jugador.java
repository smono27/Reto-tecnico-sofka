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
public class Jugador {
    private String nombre;
    private int comodines, rondas_g, puntajeT;    

    public Jugador() {
        nombre = "";
        comodines = 0;
        rondas_g = 0;
        puntajeT = 0;
    }

    public Jugador(String nombre, int comodines, int rondas_g, int puntajeT) {
        this.nombre = nombre;
        this.comodines = comodines;
        this.rondas_g = rondas_g;
        this.puntajeT = puntajeT;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getComodines() {
        return comodines;
    }

    public void setComodines(int comodines) {
        this.comodines = comodines;
    }

    public int getRondas_g() {
        return rondas_g;
    }

    public void setRondas_g(int rondas_g) {
        this.rondas_g = rondas_g;
    }

    public int getPuntajeT() {
        return puntajeT;
    }

    public void setPuntajeT(int puntajeT) {
        this.puntajeT = puntajeT;
    }
    
    @Override
    public String toString() {
        return nombre + '|' + comodines + '|' + rondas_g + '|' + puntajeT + '|';
    }
    
}
