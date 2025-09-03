import java.util.*;

public class Ordenador {

    /**
     * Ordena la lista de pedidos por tiempo de preparación en orden ascendente
     * utilizando el algoritmo de inserción.
    */

    public void ordenarPorTiempoInsercion(List<Pedido> pedidos) {
        int cantidad = pedidos.size();

        for (int posicionActual = 1; posicionActual < cantidad; posicionActual++) {

            // Elemento a reubicar en esta iteración
            Pedido pedidoActual = pedidos.get(posicionActual);
            int tiempoActual = pedidoActual.getTiempoDePreparacion();

            // Índice para comparar hacia la izquierda
            int posicionDeComparacion = posicionActual - 1;

            // Desplaza a la derecha los elementos con tiempo mayor al tiempoActual
            while (posicionDeComparacion >= 0 &&
                   pedidos.get(posicionDeComparacion).getTiempoDePreparacion() > tiempoActual) {

                // Corrimiento: copia el elemento de la izquierda en la posición siguiente
                pedidos.set(posicionDeComparacion + 1, pedidos.get(posicionDeComparacion));

                // Avanza la comparación hacia la izquierda
                posicionDeComparacion--;
            }

            // Inserta el elemento en la posición determinada
            pedidos.set(posicionDeComparacion + 1, pedidoActual);
        }
    }



    /**
     * El metodo Ordena la lista de pedidos por precio total en orden ascendente
     * utilizando el algoritmo de Shellsort.
    */

    public void ordenarPorPrecioShellsort(List<Pedido> pedidos) {
        int longitud = pedidos.size();

        // Tamaño de salto inicial y reducción progresiva
        for (int tamañoDelSalto = Math.max(1, longitud / 2);
             tamañoDelSalto > 0;
             tamañoDelSalto /= 2) {

            // Recorre desde la posición igual al salto hasta el final
            for (int posicionActual = tamañoDelSalto; posicionActual < longitud; posicionActual++) {

                // Elemento a reubicar en el grupo definido por el salto
                Pedido pedidoActual = pedidos.get(posicionActual);
                double precioActual = pedidoActual.getPrecioTotal();

                // Índice para comparar posiciones separadas por tamañoDelSalto
                int posicionDeComparacion = posicionActual;

                // Desplaza hacia adelante los elementos con precio mayor al precioActual
                // en pasos de tamañoDelSalto
                while (posicionDeComparacion >= tamañoDelSalto &&
                       pedidos.get(posicionDeComparacion - tamañoDelSalto).getPrecioTotal() > precioActual) {

                    // Corrimiento dentro del grupo: mueve el elemento de atrás a la posición actual
                    pedidos.set(posicionDeComparacion,
                                pedidos.get(posicionDeComparacion - tamañoDelSalto));

                    // Retrocede tamañoDelSalto posiciones
                    posicionDeComparacion -= tamañoDelSalto;
                }

                // Inserta el elemento en la posición determinada dentro del grupo
                pedidos.set(posicionDeComparacion, pedidoActual);
            }
        }
    }



    
/**
 * El metodo ordena la lista de pedidos por nombre de cliente en orden ascendente.
 * Usa el algoritmo Quicksort con partición tipo Lomuto (pivote = último elemento).
 */
public void ordenarPorNombreQuicksort(List<Pedido> pedidos) {
    if (pedidos == null || pedidos.size() < 2) return;
    quicksortPorNombre(pedidos, 0, pedidos.size() - 1);
}

// Llama recursivamente sobre los subrangos [inicio..pivote-1] y [pivote+1..fin].
private void quicksortPorNombre(List<Pedido> pedidos, int indiceInicio, int indiceFin) {
    if (indiceInicio >= indiceFin) return;

    int indicePivote = particionarPorNombre(pedidos, indiceInicio, indiceFin);

    quicksortPorNombre(pedidos, indiceInicio, indicePivote - 1);
    quicksortPorNombre(pedidos, indicePivote + 1, indiceFin);
}

/**
 * Reorganiza el rango [indiceInicio..indiceFin] según el valor del pivote
 * y devuelve la posición final del pivote.
 */
private int particionarPorNombre(List<Pedido> pedidos, int indiceInicio, int indiceFin) {
    String valorPivote = pedidos.get(indiceFin).getNombreCliente();
    int indiceParaMenores = indiceInicio;

    for (int indiceExploracion = indiceInicio; indiceExploracion < indiceFin; indiceExploracion++) {
        String nombreActual = pedidos.get(indiceExploracion).getNombreCliente();

        // Si el nombre actual es menor o igual al pivote (ignorando mayúsculas/minúsculas),
        // se mueve a la zona izquierda.
        if (nombreActual.compareToIgnoreCase(valorPivote) <= 0) {
            Collections.swap(pedidos, indiceParaMenores, indiceExploracion);
            indiceParaMenores++;
        }
    }

    // Coloca el pivote en su posición final
    Collections.swap(pedidos, indiceParaMenores, indiceFin);
    return indiceParaMenores;
}


}
