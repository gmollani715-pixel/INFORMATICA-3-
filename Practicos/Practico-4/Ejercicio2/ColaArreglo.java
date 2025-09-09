package Ejercicio2;

public class ColaArreglo {
 

    //Atributos
    private int front = 0;
    private int back = 0;
    private int capacidad = 0;
    //Arreglo
    int [] arreglo;


    //Constructor
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
    }



    //Metodo para agregar un elemento a la cola
    public void enqueue (int dato){

        if (back < capacidad){

            arreglo[back] = dato;
            back++;

            System.out.println("Seguardo en la cola el elemento");

        }else {
            System.out.println("La cola esta llena");
        }

    }

    //Metodo para eliminar un elemento de la cola
    public int dequeue(){

        if(isEmpty(0)){

            return -1;
        }

        int dato = arreglo[front];
        front++;

        return dato;

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

}
