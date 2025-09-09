
public class PilaArrglo {


    private int top = -1;

    private int[] arreglo = new int[6];

    //Metodo de push (Carga)
    public void push(int dato){

        if(isFull()){
            return;
        }

        arreglo[top + 1]  = dato;
        top++;
            
        System.out.println("Se guardo el dato en la sima de la pila");


    }

    //Metodo de pop (Descarga)
    public void pop(){
        
        if(isEmpty()){
            return;
        }
        
         top--;
         System.out.println("Se elimino el dato en la cima de la pila");
    

    }

    public void top(){

       if(isEmpty()){
           return;
       }

        System.out.println("El ultimo elemnto agregado a la pila es:" + arreglo[top]);

    }

    public boolean isEmpty(){

        if(top == -1){

            System.out.println("La pila esta vacia");
            return true;
        }else{
            System.out.println("La pila no esta vacia");
            return false;
        }

    }

    public boolean isFull(){

        if(top == 5){
            System.out.println("La pila esta llena");
            return true;
        }else{
            System.out.println("La pila no esta llena");
            return false;
        }

    }

}