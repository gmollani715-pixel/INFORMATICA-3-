/* */

package Ejercicio5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String palabra = consola.nextLine();

        boolean resultado = PilaYCola.esPalindromo(palabra);

        System.out.println("\nPalabra/frase: " + palabra);
        if (resultado) {
            System.out.println(" Es palíndromo.");
        } else {
            System.out.println(" No es palíndromo.");
        }

        consola.close();
    }
}
