/* Ejercicio 4 – Eliminar por valor
Implementa el método eliminar(int valor) que elimine el primer nodo que contenga
ese valor.
● Prueba con la lista [10 -> 20 -> 30 -> 40] eliminando el 30.
● Verifica el resultado: [10 -> 20 -> 40]. */

package Ejercicio4;

/* Ejercicio 4 – Eliminar por valor
Implementa el método eliminar(int valor) que elimine el primer nodo que contenga
ese valor.
● Prueba con la lista [10 -> 20 -> 30 -> 40] eliminando el 30.
● Verifica el resultado: [10 -> 20 -> 40].
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Lista<Integer> lista = new Lista<>();
        int opcion = 0;
        int condicion = 0;

        do {
            System.out.println("\n=== MENU LISTA ENLAZADA ===");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Eliminar por valor");
            System.out.println("4. Mostrar lista completa");
            System.out.println("5. Cargar ejemplo [10, 20, 30, 40]");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero: ");
                    int datoInicio = EntradaNumerica.leerEntero(consola, "");
                    lista.agregarAlInicio(datoInicio);
                    break;

                case 2:
                    System.out.print("Ingrese un número entero: ");
                    int datoFinal = EntradaNumerica.leerEntero(consola, "");
                    lista.agregarAlFinal(datoFinal);
                    break;

                case 3:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valor = EntradaNumerica.leerEntero(consola, "");
                    lista.eliminarPorValor(valor);
                    break;

                case 4:
                    lista.mostrarDatosLista();
                    break;

                case 5:
                    lista.agregarAlFinal(10);
                    lista.agregarAlFinal(20);
                    lista.agregarAlFinal(30);
                    lista.agregarAlFinal(40);
                    System.out.println("Ejemplo cargado correctamente.");
                    break;

                case 6:
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
