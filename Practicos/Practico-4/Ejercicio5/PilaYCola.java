package Ejercicio5;

public class PilaYCola {

    public static boolean esPalindromo(String palabra) {
        if (palabra == null) return false;

        // Normalizar: minúsculas y sin espacios (ajustá si querés quitar tildes/puntuación)
        String limpia = palabra.toLowerCase().replaceAll("\\s+", "");

        // Pila y cola con capacidad = longitud de la palabra normalizada
        PilaArrglo pila = new PilaArrglo(limpia.length());     
        ColaArreglo cola = new ColaArreglo(limpia.length());   

        // Cargar letra por letra CONVERSIÓN char -> String
        for (char ch : limpia.toCharArray()) {
            String s = String.valueOf(ch);
            pila.push(s);
            cola.enqueue(s);
        }

        // Comparar izquierda->derecha (cola) y derecha->izquierda (pila)
        while (true) {
            String izq = cola.dequeue();   
            String der = pila.pop();       
            if (izq == null && der == null) break;         // se vaciaron ambas
            if (izq == null || der == null) return false;  // tamaños distintos
            if (!izq.equals(der)) return false;            // diferencia de caracteres
        }

        return true;
    }
}
