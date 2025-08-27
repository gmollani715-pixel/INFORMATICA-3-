/* Ejercicio 7 – Números de Fibonacci optimizados
Escriba una función recursiva para calcular el n-ésimo número de Fibonacci.
👉 Discuta con la IA cómo mejorar la eficiencia (por ejemplo, con memoización). */

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese un número n para calcular Fibonacci(n): ");
        int n = consola.nextInt();

        int resultado = fibonacci(n);

        System.out.println("Fibonacci(" + n + ") = " + resultado);

        
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // caso base
        }
        if (n == 1) {
            return 1; // caso base
        }
        // paso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
