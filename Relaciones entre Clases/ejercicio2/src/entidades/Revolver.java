/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author Mati
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;
    
    Random rnd = new Random();

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver(){
        
        this.posicionActual = rnd.nextInt(6);
        this.posicionAgua = rnd.nextInt(6);
        
    }
    
    public boolean mojar(){
        if (posicionActual==posicionAgua){
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteChorro(){
        
        /* Aleatoria*/
        
        posicionActual = rnd.nextInt(6);
        
        /* Si la posicion es sucesiva y no aleatoria
        if (posicionActual==5){
            posicionActual=0;
        }else{
            posicionActual++;
        }
        */
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
