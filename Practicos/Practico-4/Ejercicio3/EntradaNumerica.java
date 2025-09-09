import java.util.Scanner;

public final class EntradaNumerica {

    private EntradaNumerica() { } // evitar instanciación

    /** Lee un entero (int). Si se ingresa letra/símbolo, muestra advertencia y vuelve a pedir. */
    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            if (mensaje != null && !mensaje.isBlank()) System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida: se esperaba un número entero (int). No ingrese letras ni símbolos. Intente nuevamente.");
            }
        }
    }

    /** Lee un entero largo (long). */
    public static long leerEnteroLargo(Scanner sc, String mensaje) {
        while (true) {
            if (mensaje != null && !mensaje.isBlank()) System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                return Long.parseLong(linea);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida: se esperaba un número entero largo (long). Intente nuevamente.");
            }
        }
    }

    /** Lee un real (double). Acepta coma o punto decimal. */
    public static double leerReal(Scanner sc, String mensaje) {
        while (true) {
            if (mensaje != null && !mensaje.isBlank()) System.out.print(mensaje);
            String linea = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Entrada inválida: se esperaba un número real (double). Use solo números y separador decimal. Intente nuevamente.");
            }
        }
    }
}
