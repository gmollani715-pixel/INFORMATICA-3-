package Ejercicio4;

public class ColaArreglo {
 

    //Atributos
    private int front;
    private int back;
    private int capacidad;
    //Arreglo
    Cliente [] arreglo;


    //Constructor
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new Cliente[capacidad];
    }



    //Metodo para agregar un elemento a la cola
    public void enqueue (Cliente dato){

        if (back < capacidad){

            arreglo[back] = dato;
            back++;

            System.out.println("Seguardo en la cola el elemento");

        }else {
            System.out.println("La cola esta llena");
        }

    }

    //Metodo para eliminar un elemento de la cola
    public void dequeue(){

        if(isEmpty(0)){

            return;
        }

        Cliente dato = arreglo[front];
        front++;

        System.out.println("Se quito de la cola el elemento: " + dato);

        return;

    }

    //Metodo para ver el primer elemento de la cola
    public void top(){

        if(isEmpty(0)){

            return;
        }

        System.out.println("El primer elemento de la cola es:" + arreglo[front]);

        return;
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

    //Metodo para mostrar la cola
    public void mostrarCola(){
        if(isEmpty(0)){

            return;
        }

        System.out.println("\n--Elementos de la cola--\n");

        for (int i = front; i < back; i++) {

            System.out.println(arreglo[i]);

        }

        System.out.println("\n--Fin de la cola--\n");

        return;
    }
}
