/*Ejercicio 2 – Insertar al inicio
Implementa el método insertarInicio(int dato) en la clase ListaEnlazada.
● Prueba insertando los valores: 10, 20, 30.
● Imprime la lista para verificar que el orden sea correcto.  */

package Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Lista<Integer> lista = new Lista<>();
        int opcion = 0;
        int condicion = 0;

        do {
            System.out.println("\n=== MENU LISTA ENLAZADA ===");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Mostrar lista completa");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int dato = EntradaNumerica.leerEntero(consola, "");
                    lista.agregarAlInicio(dato);
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
