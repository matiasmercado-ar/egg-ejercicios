/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Peliculas {
 
    private String titulo;
    private String director;
    private int duracion;
    
    Scanner keyb = new Scanner (System.in).useDelimiter("\n");

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Peliculas crearPelicula (){
        System.out.println("Introducir titulo pelicula: ");
        titulo = keyb.next();
        
        System.out.println("Introducir director: ");
        director = keyb.next();
        
        System.out.println("Introducir duracion (horas): ");
        duracion = keyb.nextInt();
        
        return new Peliculas (titulo, director, duracion);
    }
    
}
