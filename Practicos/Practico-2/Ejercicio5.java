/* Ejercicio 5 – Conversión binaria
Escriba un método recursivo que reciba un número entero positivo y devuelva su
representación en binario (como string).
Ejemplo: 13 → "1101".
 */

 import java.util.*;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el nuemero positivo que desea convertir a binario:");
        int numero = consola.nextInt();

        String numero_binario = ConversorABinario(numero);

        System.out.println("El numero convertidoa  binario es: " + numero_binario);
            
        

    }


    public static String ConversorABinario (int numero){

        if ((numero == 0) | (numero == 1)){

            return Integer.toString(numero);

        }else {

            String resto = Integer.toString(numero % 2);

            return resto + ConversorABinario(numero / 2);

        }

    }

}
