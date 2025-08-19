public class Tarea {

    int estado;
    String descripcion;

    // Constructor
    public Tarea(int estado, String descripcion) {
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // ToString
    @Override
    public String toString() {
        return "Tarea{" +
                "Estado=" + estado +
                ", Descripcion='" + descripcion + '\'' +
                '}';
    }

}