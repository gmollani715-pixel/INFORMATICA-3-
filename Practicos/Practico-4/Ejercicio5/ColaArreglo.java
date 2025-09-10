package Ejercicio5;

public class ColaArreglo {
 

    //Atributos
    private int front;
    private int back;
    private int capacidad;
    //Arreglo
    String [] arreglo;


    //Constructor
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
    }



    //Metodo para agregar un elemento a la cola
    public void enqueue (String dato){

        if (back < capacidad){

            arreglo[back] = dato;
            back++;

            System.out.println("Seguardo en la cola el elemento: " + dato);

        }else {
            System.out.println("La cola esta llena");
        }

    }

    //Metodo para eliminar un elemento de la cola
    public String dequeue(){

        if(isEmpty(0)){

            return null;
        }

        String dato = arreglo[front];
        front++;

        return dato;

    }
    
    //Metodo que verifica si la cola esta vacia
    public boolean isEmpty (int opcion){

        if (front == back){

            System.out.println("\n--La cola esta vacia--\n");
            return true;
        }

        if (opcion == 1){
            System.out.println("\n--La cola no esta vacia--\n");    
        }
        
        return false;

    }


    //Metodo que verifica si la cola esta llena
    public void isFull (){

        if ( capacidad == back){

            System.out.println("\n--La cola esta llena--\n");
            return;
        }

         System.out.println("\n--La cola no esta llena--\n");   
        
        return;

    }

}
