/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        for(Peliculas i : listaPeliculas){
            System.out.println("Todas las peluculas"+i.getTitulo());
        }
        
        for (Peliculas i : listaPeliculas){
            if (i.getDuracion()>1){
                System.out.println("Peliculas que duran más de 1 hora: "+i.getTitulo());
            }
        }
        
        
    }
    
}
