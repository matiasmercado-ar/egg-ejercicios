/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Main {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        int menu, precioAux;
        int i = 0;
        int finalizar = 0;
        String aux;

        HashMap<Integer, Producto> productos = new HashMap();

        System.out.println("--Bienvenido--\n Que desea hacer?");

        do {
            System.out.println(
                    "1- Añadir un nuevo producto\n"
                    + "2- Modificar un precio \n"
                    + "3- Eliminar un producto\n"
                    + "4- Mostrar todos los productos con sus precios\n"
                    + "5- Salir");

            menu = keyb.nextInt();
            //Control erro de numero de menu
            while (menu > 5 && menu < 1) {
                System.out.println("Ingrese un numero del menu valido (1-5)");
                menu = keyb.nextInt();
            }

            switch (menu) {
                case 1:
                    Producto producto = new Producto();
                    System.out.println("Ingrese nombre del producto ");
                    producto.setNombre(keyb.next());
                    System.out.println("Ingrese el precio del producto ");
                    producto.setPrecio(keyb.nextInt());

                    productos.put(i, producto);
                    i++;
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del producto a modificar: ");
                    aux = keyb.next();

                    for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
                        Integer key = entry.getKey();
                        Producto value = entry.getValue();

                        if (entry.getValue().getNombre().equals(aux)) {
                            System.out.println("Ingrese el precio a modificar: ");
                            precioAux = keyb.nextInt();
                            value.setPrecio(precioAux);
                        }

                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del producto a eliminar: ");
                    aux = keyb.next();

                    for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
                        Integer key = entry.getKey();
                        Producto value = entry.getValue();

                        if (entry.getValue().getNombre().equals(aux)) {
                            productos.remove(key);
                        }
                    }
                    break;

                case 4:
                    for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
                        Integer key = entry.getKey();
                        Producto value = entry.getValue();

                        System.out.println("Producto: " + value.getNombre() + " - Precio: $" + value.getPrecio());

                    }
                    break;

                case 5:
                    finalizar = 1;
                    System.out.println("Adios!");
                    break;

            }
        } while (finalizar == 0);
    }

}
