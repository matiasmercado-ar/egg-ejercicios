/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Mati
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        revolver = r;
    }

    public void ronda() {

        //Auxliares
        boolean aux;
        int finalizar = 0;
        int i = 1;

        while (finalizar == 0) {
            for (Jugador jugador : jugadores) {
                aux = jugador.disparo(revolver);

                System.out.println("Ronda " + i + " :\n"
                        + jugador.getNombre() + ", revolver pocicion actual " + revolver.getPosicionActual());
                i++;
                if (aux == true) {
                    System.out.println("El jugador mojado es: " + jugador.getNombre());
                    finalizar = 1;
                    break;
                } else {
                    revolver.siguienteChorro();
                }
            }
        }
    }
}
