import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Main {

    public static void main(String[] args) {

        String raza, aux;
        int finalizar = 0;

        ArrayList<String> lista = new ArrayList();
        Scanner keyb = new Scanner(System.in).useDelimiter("\n");

        while (finalizar == 0) {

            System.out.println("Ingrese raza de perro: ");
            raza = keyb.next();

            lista.add(raza);

            System.out.println("Desea agregar una raza más? (Y/N)");
            aux = keyb.next();
            aux = aux.toUpperCase();

            while (!(aux.equals("Y")) && !(aux.equals("N"))) {
                System.out.println("Letra invalida por favor ingrese Y o N");
                aux = keyb.next();
                aux = aux.toUpperCase();
            }

            if (aux.equals("N")) {
                finalizar = 1;

                for (String i : lista) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("Ingrese un perro a elimiar: ");
        raza = keyb.next();

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String auxiliar = it.next();

            if (!(auxiliar.equals(raza))) {
                System.out.println("La raza "+raza+" no concuerda con lo ingresado en la lista.");
                for (String i : lista) {
                    System.out.println(i);
                }
            }

            if (auxiliar.equals(raza)) {
                it.remove();
            }
        }

    }
}
