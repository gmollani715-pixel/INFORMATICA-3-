
import java.util.*;

public class Pizzeria {

    Scanner consola = new Scanner(System.in);

    ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

    // Metodo agrega nuevo pedido
    public void AgregarPedido() {

        System.out.println("Ingrese el nombre del Cliete");
        String nombre = consola.nextLine();
        System.out.println("Ingrese el precio del pedido");
        int precio = consola.nextInt();
        consola.nextLine();
        System.out.println("Ingrese el tiempo de preparacion");
        int tiempo = consola.nextInt();
        consola.nextLine();

        listaPedidos.add(new Pedido(tiempo, precio, nombre, 0));
        System.out.println("El pedido se agrego con exito");

    }

    // Metodo elimna los pedidos Completados
    public void EliminarPedidosCompletados() {

        System.out.println("Eliminando pedidos completados...");

        for (int i = 0; i < listaPedidos.size(); i++) {

            if (listaPedidos.get(i).getEstado() == 1) {

                listaPedidos.remove(i);
            }

            i++;
        }
    }

    // Metodo muestra los pedidos
    public void MostrarPedidos() {

        int i = 0;

        for (Pedido pedido : listaPedidos) {
            System.out.println("Pedido nro: " + i);
            System.out.println(pedido);

            i++;
        }
    }

    // Metodo actualiza el estad de los pedidos
    public void ActualizarPedidos() {

        int opcion;

        System.out.println("Ingrese el nro del pedido que desea actualizar");
        int numero = consola.nextInt();

        System.out.println("Selecione una opcion par arealizar una opcion teniendo en cuenta:");
        System.out.println("1- Modificar tiempo estimado");
        System.out.println("2- Modificar precio total");
        System.out.println("3- Modificar Estado");
        System.out.println("4- Cancelar");
        opcion = consola.nextInt();
        consola.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nuevo tiempo estimado");
                int tiempo = consola.nextInt();
                consola.nextLine();
                listaPedidos.get(numero).setTiempoDePreparacion(tiempo);
                break;
            case 2:
                System.out.println("Ingrese el nuevo precio total");
                int precio = consola.nextInt();
                consola.nextLine();
                listaPedidos.get(numero).setPrecioTotal(precio);
                break;
            case 3:
                System.out.println("Ingrese el nuevo estado (0- En preparacion, 1- Completado)");
                int estado = consola.nextInt();
                consola.nextLine();
                listaPedidos.get(numero).setEstado(estado);
                break;
            case 4:
            
                break;

            default:
                break;
        }

        System.out.println("El pedido fue actualziado");
    }

}
