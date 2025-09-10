package Ejercicio8;

public class Llamada {
    private String nombre;
    private int numero;

    // Constructor
    public Llamada(int numero) {
        this.numero = numero;
        this.nombre = "Llamada #";
        
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    // toString
    @Override
    public String toString() {
        return nombre + numero;
    }
}
