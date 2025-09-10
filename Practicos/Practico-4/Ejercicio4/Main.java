/*Ejercicio 4 – Simulación de Turnos con Cola
Implemente un programa que utilice ColaArreglo para simular una fila de espera en un
banco.
● Los clientes llegan en el orden: Ana, Luis, Marta, Pedro.
● Se atienden los dos primeros clientes.
Mostrar la cola antes y después de atender. */

package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        // Cola de 10 posiciones para los clientes
        ColaArreglo cola = new ColaArreglo(10);

        int contador = 0;

        int opcion;
        do {
            System.out.println("\n=== SIMULACIÓN DE TURNOS EN EL BANCO ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Quitar cliente");
            System.out.println("3. Ver primer cliente (top)");
            System.out.println("4. Mostrar cola completa");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1: // Agregar cliente
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = consola.nextLine();
                    Cliente nuevoCliente = new Cliente(contador, nombre);
                    contador++;
                    cola.enqueue(nuevoCliente);
                    break;

                case 2: // Quitar cliente
                    cola.dequeue();

                case 3: // Ver frente
                    cola.top();
                    break;

                case 4: // Mostrar toda la cola
                    cola.mostrarCola();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        consola.close();
    }
}
