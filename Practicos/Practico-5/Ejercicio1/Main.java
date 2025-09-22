/* Ejercicio 1 – Crear un nodo
Escribe una clase Nodo que almacene un número entero y un puntero al siguiente nodo.
● Implementa un programa que cree tres nodos y los enlace manualmente.
● Imprime la lista completa. */

package Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Lista<Integer> lista = new Lista<>();
        int opcion = 0;
        int condicion = 0;

        do {
            System.out.println("\n=== MENU LISTA ENLAZADA ===");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Mostrar lista completa");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int dato = EntradaNumerica.leerEntero(consola, "");
                    lista.cargaNodos(dato);
                    System.out.println("Nodo agregado correctamente.");
                    break;

                case 2:
                
                    System.out.println("Contenido de la lista:");
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
