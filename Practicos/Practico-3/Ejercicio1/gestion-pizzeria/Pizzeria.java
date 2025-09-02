package Ejercicio1;

import java.util.*;

public class Pizzeria {
   
    Scanner consola = new Scanner(System.in);

    ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

    //Metodo agrega nuevo pedido
    public void AgregarPedido (){

        System.out.println("Ingrese el nombre del Cliete");
        String nombre = consola.nextLine();
        System.out.println("Ingrese el precio del pedido");
        int precio = consola.nextInt();
        consola.nextLine();
        System.out.println("Ingrese el tiempo de preparacion");
        int tiempo = consola.nextInt();
        consola.nextLine();

        listaPedidos.add(new Pedido(tiempo, precio, nombre,0));
        System.out.println("El pedido se agrego con exito");

    }

    //Metodo que elimna los pedidos Completados
    public void EliminarPedidosCompletados(){

        



    }



}
