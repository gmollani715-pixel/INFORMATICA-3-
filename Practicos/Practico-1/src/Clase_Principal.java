import java.util.Scanner;

public class Clase_Principal {
    public static void main(String[] args) {

        Gestor_de_tareas gestor = new Gestor_de_tareas();
        String archivo = "tareas.txt";

        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        int condicion = 0;

        // cargar tareas guardadas al iniciar
        gestor.cargarDesdeArchivo(archivo);

        do {

            System.out.println("\nGestor de tareas iniciado.");
            System.out.println("Ingrese una opcion teniendo en cuenta");
            System.out.println("1. Agregar tarea y asignarle un estado");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Marcar una tarea como completada");
            System.out.println("4. Eliminar tareas completadas");;
            System.out.println("5. Salir del gestor de tareas");
            opcion = consola.nextInt();
            consola.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    gestor.AgregarTarea();
                    break;
                case 2:
                    gestor.mostrarTareas();
                    break;
                case 3:
                    gestor.completarTarea();
                    break;
                case 4:
                    gestor.eliminarTareasCompletadas();
                    break;
                case 5:
                    gestor.guardarEnArchivo(archivo);
                    System.out.println("Saliendo del gestor de tareas.");
                    condicion = 1;
                    break;
                default:
                    System.out.println("Opción no válida.");

            }

        } while (condicion != 1);

    }
}