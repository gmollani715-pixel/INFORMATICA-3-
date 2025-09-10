/*Ejercicio 7 – Simulación de Impresora con Cola
Una impresora recibe documentos en orden de llegada.
● Cada documento tiene un número (ej: Doc1, Doc2, Doc3).
● Se procesan en orden usando una cola.
📌 Simule la llegada de 5 documentos y la impresión de 3 de ellos. */

package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        // Crear cola con capacidad 5
        ColaArreglo cola = new ColaArreglo(5);

        int opcion;
        int contadorDocs = 0; 

        do {
            System.out.println("===== MENÚ IMPRESORA =====");
            System.out.println("1. Agregar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Ver siguiente documento en cola");
            System.out.println("4. Mostrar toda la cola");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    Documento doc = new Documento(contadorDocs++);
                    cola.enqueue(doc);
                    break;

                case 2:
                    cola.dequeue();
                    break;

                case 3:
                    cola.top();
                    break;

                case 4:
                    cola.mostrarCola();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 5);

     consola.close();
    }
}
