/* Ejercicio 1 – Conteo de dígitos
Escriba una función recursiva que calcule cuántos dígitos tiene un número entero positivo.
Ejemplo: 12345 → 5. */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String [] args){

        int contador = 0;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el numero al que quiere saber su cantidad de digitos");
        int numero = consola.nextInt();

        int cantidad = contarDigitos(numero, contador);
        System.out.println("La cantidad de digitos con la que cuenta el nuemro es: " + cantidad);
    }
    
    public static int contarDigitos(int numero, int contador){

        if (numero < 10){
            return contador + 1;
        }else {

            numero = numero / 10;
            contador++;
            return contarDigitos(numero, contador);
        }
        

    }

}
