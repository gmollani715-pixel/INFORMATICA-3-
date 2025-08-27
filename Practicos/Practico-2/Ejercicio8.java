/* Ejercicio 8 – Buscar en un arreglo
   Método recursivo que determina si un número está en un arreglo de enteros.
   Ejemplo: [3, 5, 7, 9], buscar 7 → true. */


import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        
        int[] arreglo = {3, 5, 7, 9};

        System.out.print("Ingrese el número a buscar: ");
        int buscado = consola.nextInt();

        boolean resultado = buscar(arreglo, buscado, 0);

        if (resultado) {
            System.out.println("El número " + buscado + " SÍ se encuentra en el arreglo.");
        } else {
            System.out.println("El número " + buscado + " NO se encuentra en el arreglo.");
        }

      
    }

    
    public static boolean buscar(int[] arreglo, int buscado, int indice) {
        
        if (indice == arreglo.length) {
            return false;
        }
        
        if (arreglo[indice] == buscado) {
            return true;
        }
        
        return buscar(arreglo, buscado, indice + 1);
    }
}
