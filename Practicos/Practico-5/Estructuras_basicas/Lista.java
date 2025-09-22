import java.util.*;


public class Lista<T> {

    Nodo<T> head; // Primer nodo
    int tamano; // Cantidad de nodos

    // Constructor
    public Lista() {

        this.tamano = 0;
        this.head = null;

    }

    // Metodo que agrega nodos a la lista
    public void cargaNodos(T dato) {

        Nodo<T> nuevoNodo = new Nodo<T>(dato);

        if (head == null) {

            head = nuevoNodo;
            tamano++;

        } else {

            Nodo<T> auxuliar = head;

            while (auxuliar.siguienteNodo != null) {

                auxuliar = auxuliar.siguienteNodo;

            }

            auxuliar.siguienteNodo = nuevoNodo;
            tamano++;
        }
    }

    // Metodo que imprime los nodos de la lista
    public void mostrarDatosLista() {

        Nodo<T> auxiliar = head;
        int contador = 0;

        if (head == null) {

            System.out.println(" La lista está vacía.");
            return;

        }

        System.out.println("Los datos almacenados en la lista son:");

        while (auxiliar != null) {
            System.out.println("-- El dato almacenado en el nodo nro " + contador + " es: " + auxiliar.dato);
            auxiliar = auxiliar.siguienteNodo;
            contador++;
        }

    }

    // Metodo que agrega nodos al inicio de la lista
    public void agregarAlInicio(T dato) {

        Nodo<T> nuevoNodo = new Nodo<T>(dato);

        nuevoNodo.siguienteNodo = head;
        head = nuevoNodo;
        tamano++;

        System.out.println(" Nodo agregado al inicio correctamente.");

    }

    // Metodo que inserta nodos al final de la lista
    public void agregarAlFinal(T dato) {

        Nodo<T> nuevoNodo = new Nodo<T>(dato);

        if (head == null) {

            head = nuevoNodo;
            tamano++;

        } else {

            Nodo<T> auxiliar = head;

            while (auxiliar.siguienteNodo != null) {

                auxiliar = auxiliar.siguienteNodo;

            }

            auxiliar.siguienteNodo = nuevoNodo;
            tamano++;

        }

    }

    // Metodo que elimina el primer nodo que contenga el valor especificado
    public void eliminarPorValor(T dato) {

        Nodo<T> auxiliar = head;
        Nodo<T> nodoAnterior = head;

        if (head == null) {

            System.out.println("La lista esta vacia");
            return;

        }

        if (head.dato.equals(dato)) {

            head = head.siguienteNodo;
            System.out.println("Se elimino con exito el dato");

        } else {

            auxiliar = head.siguienteNodo;

            if (auxiliar == null) {
                System.out.println("El dato no se encuentra en la lista");
                return;
            }

            while (auxiliar.dato.equals(dato) != true) {

                if (auxiliar.siguienteNodo == null) {

                    System.out.println("El dato no se encuentra en la lista");
                    return;
                }

                nodoAnterior = auxiliar;
                auxiliar = auxiliar.siguienteNodo;

            }

            nodoAnterior.siguienteNodo = auxiliar.siguienteNodo;

            System.out.println("Se elimino con exito el dato");

        }

    }

    // Meotodo que que busca un elemento en la lista
    public boolean buscarElemento(T dato) {
        Nodo<T> auxiliar = head;

        while (auxiliar != null) {
            if (Objects.equals(auxiliar.dato, dato)) {
                return true;
            }
            auxiliar = auxiliar.siguienteNodo;
        }

        return false;
    }

    //Meotod que invierte la lista
    public void invertirLista (){
            
        Lista<T> nuevaLista = new Lista<>();
        Nodo<T> aux = head;

        while (aux != null) {
            nuevaLista.agregarAlInicio(aux.dato);
            aux = aux.siguienteNodo;
        }

        head = nuevaLista.head; // reemplazo la cabeza
        System.out.println("La lista fue invertida con éxito (nueva lista).");


    }

    
}
