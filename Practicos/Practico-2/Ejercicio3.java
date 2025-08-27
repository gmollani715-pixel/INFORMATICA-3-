/* Ejercicio 3 – Suma de elementos de un arreglo
Implemente una función recursiva que calcule la suma de todos los elementos de un arreglo
de enteros.
Ejemplo: [2, 4, 6, 8] → 20.
👉 Extienda la solución para que además devuelva el promedio usando únicamente
recursión.
 */

import java.util.*;


public class Ejercicio3{
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que desea en el arreglo: ");
        int n = consola.nextInt();

        int[] arreglo = new int[n];
        int contador = 0;

        for (int i=0;i<n;i++){

            System.out.println("Ingrese el valor del elemento nro" + " " + contador + ": ");
            arreglo[contador] = consola.nextInt();
            contador++;

        }

        int suma = SumaArreglo(arreglo, 0);
        System.out.println("La suma de los elementos del arreglo es: " + suma); 

    }


    public static int SumaArreglo (int[] arreglo, int contador){

        if (arreglo.length == contador){

            return 0;

        }else {

            

            return arreglo[contador] + SumaArreglo(arreglo, contador + 1);


        }


    }



}