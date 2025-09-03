
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Pizzeria pizzeria = new Pizzeria();
        Ordenador ordenador = new Ordenador();
        TiempoOrdenamiento tiempoOrdenamiento = new TiempoOrdenamiento();

        Scanner consola = new Scanner(System.in);

        int condicion = 0;
        int opcion = 0;

        do {

            System.out.println("Bienvenido a la Pizzeria");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ingresar nuevo pedido");
            System.out.println("2. Eliminar pedidos completados");
            System.out.println("3. Actualizar informacion de pedidos");
            System.out.println("4. Ordenar pedidos por tiempo de preparacion");
            System.out.println("5. Ordenar pedidos por precio total");
            System.out.println("7. Ordenar pedidos por nombre de cliente");
            System.out.println("8. Capturar tiempo de ordenamiento");
            System.out.println("Finalizar programa");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    pizzeria.AgregarPedido();
                    break;
                case 2:
                    pizzeria.EliminarPedidosCompletados();
                    break;
                case 3:
                    pizzeria.MostrarPedidos();
                    pizzeria.ActualizarPedidos();
                    break;
                case 4:
                    tiempoOrdenamiento.TimepoDeInicio();
                    ordenador.ordenarPorTiempoInsercion(pizzeria.listaPedidos);
                    tiempoOrdenamiento.TiempoDeFinalizacion();
                    break;
                case 5:
                    tiempoOrdenamiento.TimepoDeInicio();
                    ordenador.ordenarPorPrecioShellsort(pizzeria.listaPedidos);
                    tiempoOrdenamiento.TiempoDeFinalizacion();
                    break;
                case 6:
                    tiempoOrdenamiento.TimepoDeInicio();
                    ordenador.ordenarPorNombreQuicksort(pizzeria.listaPedidos);
                    tiempoOrdenamiento.TiempoDeFinalizacion();
                    break;
                case 7:
                    tiempoOrdenamiento.MostrarResultados();
                    break;
                case 8:
                    condicion = 1;
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }

        }while (condicion != 1);

        
    }


}
