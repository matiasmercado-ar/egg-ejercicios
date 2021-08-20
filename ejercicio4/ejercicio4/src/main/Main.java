/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import servicios.Comparador;

/**
 *
 * @author Mati
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Peliculas> listaPeliculas = new ArrayList ();
        int finalizar = 0;
        Scanner keyb = new Scanner (System.in).useDelimiter("\n");
        
        
        do{
            
            Peliculas pelicula = new Peliculas ();
            listaPeliculas.add(pelicula.crearPelicula());
            
            System.out.println("Desea agregar una nueva pelicula? (Y/N)");
            String aux = keyb.next().toUpperCase();

            while (!(aux.equals("N") || aux.equals("Y"))) {
                System.out.println("Letra incorrecta, ingrese Y o N");
                aux = keyb.next();
            }
            
            if (aux.equals("N")){
                finalizar = 1;
            }
            
        }while (finalizar == 0);
        
        System.out.println("Lista de peliculas");
        
        for(Peliculas i : listaPeliculas){
            System.out.println(i.getTitulo());
        }
        
        System.out.println("Peliculas que duran más de 1 hora: ");
        
        for (Peliculas i : listaPeliculas){
            if (i.getDuracion()>1){
                System.out.println(i.getTitulo());
            }
        }
        
         /**
          * 
          * @param Collections Con collections puedo llamar a los metodos creados en la clase comparador
          */
        
        Collections.sort(listaPeliculas, Comparador.ordernarPorDuracionDesc);
        
        System.out.println("Orden descendente: ");
        
        for (Peliculas i : listaPeliculas) {
            System.out.println("Titulo: "+i.getTitulo() +" ,duración: "+i.getDuracion());
            
        }
        
        System.out.println("Orden ascendente: ");
        
        Collections.sort(listaPeliculas, Comparador.ordenarPorDuracionAsc);
        
        System.out.println("Order ascendente: ");
        
        for (Peliculas i : listaPeliculas) {
            System.out.println("Titulo: "+i.getTitulo() +" ,duración: "+i.getDuracion());
            
        }
        
        System.out.println("Orden por titulo alfabetico: ");
        
        Collections.sort(listaPeliculas, Comparador.ordenarPorTituloAlf);
        
        for (Peliculas i : listaPeliculas) {
            System.out.println("Titulo: "+i.getTitulo());
        }
        
        System.out.println("Orden por director alfabetico: ");
        
        Collections.sort(listaPeliculas, Comparador.ordenarPorDirectorAlf);
        
        for (Peliculas i : listaPeliculas) {
            System.out.println("Director: "+i.getDirector()+" Titulo: "+i.getTitulo());
        }
    }
    
}
