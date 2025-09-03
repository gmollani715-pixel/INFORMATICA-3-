
public class TiempoOrdenamiento {

    long inicio;
    long fin;

    //Metodo para capturar el tiempo de inicio
    public  void TimepoDeInicio (){

     inicio = System.currentTimeMillis();

    }

    //Metodo para capturar el tiempo de finalizacion
    public void TiempoDeFinalizacion (){

        fin = System.currentTimeMillis();

    }

    //Metodo que muestra los resultados
    public void MostrarResultados (){

        long tiempoTotal = fin - inicio;

        System.out.println("El tiempo total de ordenamiento es: " + tiempoTotal + " milisegundos");

    }
}