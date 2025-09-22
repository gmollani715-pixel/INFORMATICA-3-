/* Ejercicio 3 – Insertar al final
Agrega a la clase ListaEnlazada el método insertarFinal(int dato).
● Inserta los valores 1, 2, 3.
● Imprime la lista y verifica que se agregan en orden. */

package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Lista lista = new Lista();
        int opcion = 0;
        int condicion = 0;

        do {
            System.out.println("\n=== MENU LISTA ENLAZADA ===");
            System.out.println("1. Insertar al final");
            System.out.println("2. Mostrar lista completa");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int dato = EntradaNumerica.leerEntero(consola, "");
                    lista.agregarAlFinal(dato);
                    break;

                case 2:
                    lista.mostrarDatosLista();
                    break;

                case 3:
                    condicion = 1;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (condicion != 1);

        consola.close();
    }
}
