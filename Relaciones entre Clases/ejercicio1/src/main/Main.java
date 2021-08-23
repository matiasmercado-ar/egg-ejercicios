/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        
        Scanner keyb = new Scanner (System.in).useDelimiter("\n");
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        
        
        System.out.println("Ingrese nombre de la primer persona");
        persona1.setNombre(keyb.next());
        System.out.println("Ingrese apellido: ");
        persona1.setApellido(keyb.next());
        System.out.println("Ingrese edad: ");
        persona1.setEdad(keyb.nextInt());
        System.out.println("Ingrese DNI");
        persona1.setDocumento(keyb.nextInt());
        
        System.out.println("Ingrese nombre de la segunda persona");
        persona2.setNombre(keyb.next());
        System.out.println("Ingrese apellido: ");
        persona2.setApellido(keyb.next());
        System.out.println("Ingrese edad: ");
        persona2.setEdad(keyb.nextInt());
        System.out.println("Ingrese DNI");
        persona2.setDocumento(keyb.nextInt());
        
        System.out.println("Ingrese nombre de la primer perro");
        perro1.setNombre(keyb.next());
        System.out.println("Ingrese raza");
        perro1.setRaza(keyb.next());
        System.out.println("Ingrese edad");
        perro1.setEdad(keyb.nextInt());
        System.out.println("Ingrese tamaño");
        perro1.setTamaño(keyb.nextInt());
        
        System.out.println("Ingrese nombre de la segundo perro");
        perro2.setNombre(keyb.next());
        System.out.println("Ingrese raza");
        perro2.setRaza(keyb.next());
        System.out.println("Ingrese edad");
        perro2.setEdad(keyb.nextInt());
        System.out.println("Ingrese tamaño");
        perro2.setTamaño(keyb.nextInt());
        
        //asigno los perros a las personas
        persona1.setPerro(perro1);
        persona2.setPerro(perro2);
        
        //muestro con toString
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }

}
