/* Ejercicio 3 – Invertir una Cadena con Pila
Usando la clase PilaArreglo, escriba un programa que reciba una cadena y la invierta.
Ejemplo: "Hola" → "aloH". */

package Ejercicio3;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        int condicion = 0;
        int capacidad = 0;

        System.out.println("Ingrese la capacidad de la pila");
        capacidad = EntradaNumerica.leerEntero(consola,"");

        PilaArrglo arreglo = new PilaArrglo(capacidad);

        do{

        System.out.println("==Selecionnne una opcion==");
        System.out.println("1- Apilar");
        System.out.println("2- Desapilar");
        System.out.println("3- Ver cima");
        System.out.println("4- Ver si la pila esta vacia");
        System.out.println("5- Ver si la pila esta llena");
        System.out.println("6- Inverir cadena");
        System.out.println("7- Salir");
        int opcion = EntradaNumerica.leerEntero(consola,"");

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero que desea apilar");
                    String palabra = consola.nextLine();
                    arreglo.push(palabra);
                    break;
                case 2:
                    arreglo.pop();
                    break;
                case 3:
                    arreglo.top();
                    break;
                case 4:
                    arreglo.isEmpty(1);
                    break;
                case 5:
                    arreglo.isFull(1);
                    break;
                case 6:
                    arreglo.invertirCadena();
                    break;
                 case 7:
                    condicion = 1;
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        }while (condicion != 1);

    }
}
