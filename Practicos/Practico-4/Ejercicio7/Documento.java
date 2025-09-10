package Ejercicio7;

public class Documento {
    private String nombre;
    private int numero;

    // Constructor
    public Documento(int numero) {
        this.numero = numero;
        this.nombre = "Doc";
        
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
