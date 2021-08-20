/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Main {

    public static void main(String[] args) {

        int nuevoAlumno = 0;
        String aux;
        Scanner keyb = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        do {

            Alumno alumno = new Alumno();
            ArrayList<Integer> notas = new ArrayList<Integer>();

            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(keyb.next());

            System.out.println("Ingrese la primer nota: ");
            notas.add(keyb.nextInt());
            System.out.println("Ingrese la segunda nota: ");
            notas.add(keyb.nextInt());
            System.out.println("Ingrese la tercer nota: ");
            notas.add(keyb.nextInt());

            alumno.setNotas(notas);
            
             alumnos.add(alumno);
            System.out.println("Desea agregar un nuevo alumno? (Y/N)");
            aux = keyb.next().toUpperCase();

            while (!(aux.equals("N") || aux.equals("Y"))) {
                System.out.println("Letra incorrecta, ingrese Y o N");
                aux = keyb.next();
            }
            
            if (aux.equals("N")) {
                nuevoAlumno = 1;
            }

        } while (nuevoAlumno == 0);

        Alumno alumnoNota = new Alumno();

        System.out.println("Nota promedio del alumno ingresado: " + alumnoNota.notaFinal(alumnos));
    }
}
