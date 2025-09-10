/*Ejercicio 8 – Cola Circular para Gestión de Llamadas
Implemente una cola circular para gestionar llamadas en un call center.
● La cola tiene capacidad máxima de 5 llamadas.
● Cuando llega una nueva llamada y la cola está llena, sobrescribe la más antigua.
📌 Simule la llegada de 8 llamadas y muestre el estado final de la cola.*/


package Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        // Crear cola con capacidad 5
        ColaArreglo cola = new ColaArreglo(5);

        int opcion;
        int contadoLlamadas = 0; 

        do {
            System.out.println("===== MENÚ DE LLAMADAS =====");
            System.out.println("1. Agregar llamada");
            System.out.println("2. Imprimir llamada");
            System.out.println("3. Ver siguiente llamada en cola");
            System.out.println("4. Mostrar toda la cola");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = EntradaNumerica.leerEntero(consola, "");

            switch (opcion) {
                case 1:
                    Llamada llamada = new Llamada(contadoLlamadas++);
                    cola.enqueue (llamada);
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
