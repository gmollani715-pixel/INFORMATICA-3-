package Ejercicio5;


public class PilaArrglo {

    // Atributos
    private int top = -1;
    private int capacidad = 0;
    private String[] arreglo;



    // Constructor
    public PilaArrglo(int capacidad) {   
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
    }



    // Método que ingresa una letra en la cima de la pila
    public void push(String dato) {
        if (isFull(0)) {
            return;
        }
        top++;
        arreglo[top] = dato;
        System.out.println("Se guardó el dato en la cima de la pila: " + dato);
    }

    // Método que elimina la letra de la cima de la pila
    public String pop() {
        if (isEmpty(0)) {
            return null;
        }
        String eliminado = arreglo[top];
        top--;
        System.out.println("Se eliminó el dato en la cima de la pila");
        return eliminado;
    }

    // Método que verifica si la pila está vacía
    public boolean isEmpty(int opcion) {
        if (top == -1) {
            System.out.println("--La pila está vacía-");
            return true;
        } 
        if (opcion != 0) {
            System.out.println("La pila no está vacía");
            return false;
        }
        return false;
    }

    // Método que verifica si la pila está llena
    public boolean isFull(int opcion) {
        if (top == capacidad - 1) {
            System.out.println("La pila está llena");
            return true;
        }
        if (opcion != 0) {
            System.out.println("La pila no está llena");
            return false;
        }
        return false;
    }

}
