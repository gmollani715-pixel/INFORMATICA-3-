
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

    // Getters y Setters
    public int getTiempoDePreparacion() {
        return tiempoPreparacion;
    }
    public int getPrecioTotal() {
        return precioTotal;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }   
    public int getEstado() {
    return estado;
    }

    
    public void setTiempoDePreparacion(int tiempoPreparacion) {
    this.tiempoPreparacion = tiempoPreparacion;
    }
    public void setPrecioTotal(int precioTotal) {
    this.precioTotal = precioTotal;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }   

    //toString
    public String toString(){
        return "Nombre del cliente: " + nombreCliente + ", Tiempo de preparacion: " 
        + tiempoPreparacion + ", Precio total: " + precioTotal + ", Estado: " + estado;
    }

}
