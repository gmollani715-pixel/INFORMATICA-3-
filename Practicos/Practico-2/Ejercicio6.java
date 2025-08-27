/* Ejercicio 6 – Palíndromo
Cree una función recursiva que determine si una cadena es un palíndromo.
Ejemplo: "neuquen" → true, "informatica" → false.
 */

import java.util.*;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);


        System.out.println("Ingrese la palabra que desea ver si es un palindromo:");
        String palabra = consola.nextLine();

        Boolean resultado = Palindromo(palabra);     
        
        if(resultado == true){
            System.out.println("La palabra es un palindromo");

        }else{
            System.out.println("La palabra no es un palindormo");
        }

    }

    public static Boolean Palindromo (String palabra){

        if (palabra.length() <= 1){

            return true;
        }

        if(palabra.charAt(0) != palabra.charAt(palabra.length() -1 )){

            return false;

        }

        return Palindromo(palabra.substring(1, palabra.length()-1));

    }

}
