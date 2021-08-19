/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    /** 
     * 
     * @param alumnos es la lista que recibe para verificar si en un principio se encuentra en la lista para luego
     * definir la nota final por promedio
     *  
     */
    
    public int notaFinal (ArrayList<Alumno> alumnos){
        
        Scanner keyb = new Scanner (System.in);
        String nombre;
        ArrayList<Integer> notasAux = new ArrayList ();
        int promedio=0;
        
        System.out.println("Ingrese el nombre del alumno para calcular su promedio");
        nombre = keyb.next();
        
        Iterator<Alumno> it = alumnos.iterator();
        
        while (it.hasNext()){
            Alumno aux = it.next();
            
            if (aux.getNombre().equals(nombre)){
                
                notasAux = aux.getNotas();
                
                for (int i : notasAux){
                    promedio = promedio + i;
                } 
                
                promedio = promedio / notasAux.size();
                
            } else {
                System.out.println("El nombre ingresado es incorrecto o no se encuentra en la lista, intente de nuevo");
                nombre = keyb.next();
            }
        }
        return promedio;   
    }
    
}
