/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author Mati
 */
public class Comparador {
    
    public static Comparator<Peliculas> ordernarPorDuracionDesc = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
 public static Comparator<Peliculas> ordenarPorDuracionAsc = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
 };
    
 public static Comparator<Peliculas> ordenarPorTituloAlf = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
        }
    };
    
 public static Comparator<Peliculas> ordenarPorDirectorAlf = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDirector().compareToIgnoreCase(o2.getDirector());
        }
    };
}
