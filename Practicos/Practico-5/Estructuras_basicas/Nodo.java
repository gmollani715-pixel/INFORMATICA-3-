
public class Nodo <T> {

    T dato;
    Nodo<T> siguienteNodo;

    //Cosntructor
    public Nodo(T dato){

        this.dato = dato;
        siguienteNodo = null;

    }


    //toString
    @Override
    public String toString() {
        return "Nodo [dato=" + dato + "]";
    }
    
}