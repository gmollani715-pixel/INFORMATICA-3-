/* Ejercicio 7 – Invertir la lista
Escribe un método invertirLista() que invierta el orden de los nodos en la lista.
● Ejemplo: [10 -> 20 -> 30 -> 40] debe transformarse en [40 -> 30 -> 20 -> 10].
*/

package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Lista<Integer> lista = new Lista<>();
        int opcion = 0;
        int condicion = 0;

        do {
            System.out.println("\n=== MENU LISTA ENLAZADA ===");
            System.out.println("1. Agregar al final");
            System.out.println("2. Mostrar lista completa");
            System.out.println("3. Invertir lista");
            System.out.println("4. Cargar ejemplo [10, 20, 30, 40]");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
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
                    lista.invertirLista(); // usa TU método
                    break;

                case 4:
                    lista.agregarAlFinal(10);
                    lista.agregarAlFinal(20);
                    lista.agregarAlFinal(30);
                    lista.agregarAlFinal(40);
                    System.out.println("Ejemplo cargado correctamente: [10 -> 20 -> 30 -> 40]");
                    break;

                case 5:
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
