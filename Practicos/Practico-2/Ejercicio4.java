/* Ejercicio 4 – Máximo común divisor (MCD)
   Implemente de manera recursiva el algoritmo de Euclides para calcular el MCD de dos
   números enteros positivos.
   Ejemplo: MCD(48, 18) = 6.
*/

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        System.out.println("Cálculo de máximo común divisor (MCD)");
        System.out.print("Ingrese el primer valor: ");
        int valor1 = consola.nextInt();
        System.out.print("Ingrese el segundo valor: "); 
        int valor2 = consola.nextInt();

        
        int resultado = CalculoMaximoComunDivisor(valor1, valor2);

        System.out.println("El MCD de " + valor1 + " y " + valor2 + " es: " + resultado);

        consola.close();
    }

    
    public static int CalculoMaximoComunDivisor(int valor1, int valor2) {
        if (valor2 == 0) {
            return valor1; 
        } else {
            return CalculoMaximoComunDivisor(valor2, valor1 % valor2); 
        }
    }
}
