package Ejercicio4;

public class Cliente {
    
    int numero = 0;
    String nombre;

    //constructor
    public Cliente(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    //getters and setters
    public int getNumero() {        
        return numero;
    }               
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString
    @Override   
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
