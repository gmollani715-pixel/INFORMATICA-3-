/* Ejercicio 1 – Implementación de Pila
Implemente una clase PilaArreglo en Java utilizando un arreglo.
Métodos: push(int dato), pop(), top(), isEmpty(), isFull().
Pruebe apilando los enteros 10, 20, 30, 40 y desapilando dos.*/

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        int condicion = 0;

        PilaArrglo arreglo = new PilaArrglo();

        do{

        System.out.println("==Selecionnne una opcion==");
        System.out.println("1- Apilar");
        System.out.println("2- Desapilar");
        System.out.println("3- Ver cima");
        System.out.println("4- Ver si la pila esta vacia");
        System.out.println("5- Ver si la pila esta llena");
        System.out.println("6- Salir");
        int opcion = EntradaNumerica.leerEntero(consola, null);

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero que desea apilar");
                    int numero = EntradaNumerica.leerEntero(consola, null);
                    arreglo.push(numero);
                    break;
                case 2:
                    arreglo.pop();
                    break;
                case 3:
                    arreglo.top();
                    break;
                case 4:
                    arreglo.isEmpty();
                    break;
                case 5:
                    arreglo.isFull();
                    break;
                case 6:
                    condicion = 1;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        }while (condicion != 1);

    }
}
