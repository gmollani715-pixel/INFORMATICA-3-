/* Ejercicio 5 – Buscar un valor
Crea un método buscar(int valor) que recorra la lista y devuelva true si encuentra el nodo.
● Prueba con la lista [5 -> 15 -> 25 -> 35].
● Busca el 25 (debe devolver true) y el 100 (debe devolver false).
*/

package Ejercicio5;

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
            System.out.println("3. Buscar un valor");
            System.out.println("4. Cargar ejemplo [5, 15, 25, 35]");
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
                    System.out.print("Ingrese el valor a buscar: ");
                    int valor = EntradaNumerica.leerEntero(consola, "");
                    boolean encontrado = lista.buscarElemento(valor);
                    if (encontrado) {
                        System.out.println(" El valor " + valor + " SÍ está en la lista.");
                    } else {
                        System.out.println(" El valor " + valor + " NO se encuentra en la lista.");
                    }
                    break;

                case 4:
                    lista.agregarAlFinal(5);
                    lista.agregarAlFinal(15);
                    lista.agregarAlFinal(25);
                    lista.agregarAlFinal(35);
                    System.out.println("Ejemplo cargado correctamente: [5 -> 15 -> 25 -> 35]");
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
