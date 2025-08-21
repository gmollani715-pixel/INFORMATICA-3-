/*Ejercicio 2 – Invertir una cadena
Escriba un método recursivo que reciba una cadena y devuelva la misma cadena invertida.
Ejemplo: "recursivo" → "ovisrucer".*/

import java.util.*;

public class Ejercicio2 {
    
    public static void main (String []args){

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese una cadena que desea invertir: ");
        String cadena = consola.nextLine();

        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + cadenaInvertida);

    }

    public static String invertirCadena(String cadena){

        if (cadena.length() <= 1){

            return cadena.substring(0,1);

        }else{

            String cadena_nueva = cadena.substring(cadena.length()-1, cadena.length());

            cadena = cadena.substring(0, cadena.length()-1);

            return cadena_nueva + invertirCadena(cadena);

        }


    }


}
