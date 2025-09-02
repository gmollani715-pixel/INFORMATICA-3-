package Ejercicio1;

public class Pedido {
    
    int tiempoPreparacion = 0;
    int precioTotal = 0;
    String nombreCliente;
    int estado = 0;

    // Constructor
    public Pedido (int tiempo, int precio, String nombre, int estado){

        tiempoPreparacion = tiempo;
        precioTotal = precio;
        nombreCliente = nombre;
        this.estado = estado;
    }

    //toString
    public String toString(){
        return "Nombre del cliente: " + nombreCliente + ", Tiempo de preparacion: " 
        + tiempoPreparacion + ", Precio total: " + precioTotal + ", Estado: " + estado;
    }

}
