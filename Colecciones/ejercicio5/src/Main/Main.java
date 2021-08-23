/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mati
 */

public class Main {
    
    public static void main(String[] args) {
        
        int finalizar = 0;
        String aux;
        Scanner keyb = new Scanner (System.in);
        TreeSet <Pais> paises = new TreeSet();
        
        do {
            //Agrego paises
            Pais pais = new Pais();
            System.out.println("Ingrese un país: ");
            pais.setName(keyb.next());
            
            paises.add(pais);
            
            //Control de error + pregunto si quiero un nuevo alumno
            System.out.println("Desea agregar un nuevo pais? (Y/N)");
            aux = keyb.next().toUpperCase();

            while (!aux.equals("N") && !aux.equals("Y")) {
                System.out.println("Letra incorrecta, ingrese Y o N");
                aux = keyb.next().toUpperCase();
            }
            
            if (aux.equals("N")) {
                finalizar = 1;
            }
            
        }while (finalizar ==0);
        
        //Muestro todos los paises del conjunto
        System.out.println("Los paises del conjunto son: ");
        for (Pais pais : paises) {
            
            System.out.println(pais.getName());
        }
        
        System.out.println("Los paises ordenados alfabeticamente son: ");
        for (Pais pais : paises) {
            
             System.out.println(pais.getName());
        }
        
        System.out.println("Ingrese el país a eliminar: ");
        aux=keyb.next();
        
        //Eliminar objeto del conjunto con Iterator
        
         Iterator<Pais> it = paises.iterator();
         
         while (it.hasNext()) {
             Pais paisDeLaLista = new Pais ();
             paisDeLaLista = it.next();
             
             if(paisDeLaLista.getName().equals(aux)){
                 it.remove();
             }
             if(aux.equals(paisDeLaLista.getName())){
                 System.out.println("No se encuentra el pais en la lista");
         }
         
             
         for (Pais pais : paises) {

         System.out.println(pais.getName());
         }
             
         }
     }
}
