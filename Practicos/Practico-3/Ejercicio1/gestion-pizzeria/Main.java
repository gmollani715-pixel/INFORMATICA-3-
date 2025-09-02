package Ejercicio1;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        int condicion = 0;
        int opcion = 0;

        do {

            System.out.println("Bienvenido a la Pizzeria");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ingresar nuevo pedido");
            System.out.println("2. Eliminar pedidos completados");
            System.out.println("3. Actualizar informacion de pedidos");
            System.out.println("4. Ordenar pedidos por tiempo de preparacion");
            System.out.println("5. Ordenar pedidos por precio total");
            System.out.println("7. Ordenar pedidos por nombre de cliente");
            System.out.println("8. Capturar tiempo de ordenamiento");
            System.out.println("Finalizar programa");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    // Ingresar nuevo pedido
                    break;
                case 2:
                    // Eliminar pedidos completados
                    break;
                case 3:
                    // Actualizar informacion de pedidos
                    break;
                case 4:
                    // Ordenar pedidos por tiempo de preparacion
                    break;
                case 5:
                    // Ordenar pedidos por precio total
                    break;
                case 6:
                    // Ordenar pedidos por nombre de cliente
                    break;
                case 7:
                    // Capturar tiempo de ordenamiento
                    break;
                case 8:
                    condicion = 1;
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }

        }while (condicion != 1);

        
    }


}
