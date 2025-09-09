package Ejercicio2;

/* Ejercicio 2 – Implementación de Cola
Implemente una clase ColaArreglo en Java utilizando un arreglo.
Métodos: enqueue(int dato), dequeue(), top(), isEmpty(), isFull().
Pruebe encolando los enteros 1, 2, 3, 4 y desencolando uno. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la capacidad de la cola: ");
        int capacidad = EntradaNumerica.leerEntero(consola, "");

        ColaArreglo cola = new ColaArreglo(capacidad);

        int opcion;
        do {
            System.out.println("\n=== MENU COLA ===");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Ver frente (top)");
            System.out.println("4. Ver si está vacía");
            System.out.println("5. Ver si está llena");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número a encolar: ");
                    int valor = EntradaNumerica.leerEntero(consola, "");
                    cola.enqueue(valor);
                    break;

                case 2:
                    int eliminado = cola.dequeue();
                    System.out.println("Se desencoló: " + eliminado);
                    break;

                case 3:
                    cola.top();
                    break;

                case 4:
                    cola.isEmpty(1);
                    break;

                case 5:
                    cola.isFull();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 6);

        consola.close();
    }
}
