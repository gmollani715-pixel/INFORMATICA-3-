package Ejercicio1;

public class Lista<T> {
    
    Nodo<T> head; //Primer nodo
    int tamano;     //Cantidad de nodos

    //Constructor
    public Lista(){
        
        this.tamano = 0;
        this.head = null;
    
    }



    //Metodo que agrega nodos a la lista
    public void cargaNodos (T dato){

        Nodo<T> nuevoNodo = new Nodo<T>(dato);

        if (head == null){

            head = nuevoNodo;
            tamano++;

        }else {

            Nodo<T> auxuliar = head;

            while(auxuliar.siguienteNodo != null){

                auxuliar = auxuliar.siguienteNodo;

            }
            
            auxuliar.siguienteNodo = nuevoNodo;
            tamano++;
        }
    }

    //Metodo que imprime los nodos de la lista
    public void mostrarDatosLista (){

        Nodo<T> auxiliar = head;
        int contador = 0;

        if (head == null){

            System.out.println(" La lista está vacía.");
            return;

        }

        System.out.println("Los datos almacenados en la lista son:");

        while(auxiliar != null){
            System.out.println("-- El dato almacenado en el nodo nro " + contador + " es: " + auxiliar.dato);
            auxiliar = auxiliar.siguienteNodo;
            contador++;
        }

    }


}
