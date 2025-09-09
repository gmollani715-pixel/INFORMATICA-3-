package Ejercicio2;

import java.util.*;

public class EntradaNumerica {

    // Lee un número entero seguro
    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Ingrese un número entero.");
            }
        }
    }

    // Lee un número largo
    public static long leerEnteroLargo(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                return Long.parseLong(linea);
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Ingrese un número entero largo (long).");
            }
        }
    }

    // Lee un número real (acepta , o . como separador decimal)
    public static double leerReal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Ingrese un número real (double).");
            }
        }
    }
}
