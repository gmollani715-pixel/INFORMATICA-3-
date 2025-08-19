import java.util.*;

public class Gestor_de_tareas {

Scanner consola = new Scanner(System.in);    

List<Tarea> listaDeTareas = new ArrayList<>();

//Carga de tareas
public void AgregarTarea () {

    String descripcion;
    int estado;

    System.out.println("Ingrese la descripción de la tarea:");
    descripcion = consola.nextLine();
    System.out.println("Ingrese el estado de la tarea siendo 0 (Estado Pendiente) 1 (Estado Completada)");
    estado = consola.nextInt();

    listaDeTareas.add(new Tarea(estado, descripcion));
    System.out.println("Tarea agregada exitosamente.");
}

//Listar tareas
public void mostrarTareas(){

    int indice=0;

    for(Tarea tarea : listaDeTareas){
        System.out.println(indice);
        indice++;
        System.out.println(tarea);
    }
}

//Completar tarea
public void mostrarTarea (){

    int indice = 0;

    System.out.println("Ingrese el numero que le corresponda a la tarea que desee marcar como completada\n");
    indice = consola.nextInt();
    listaDeTareas.get(indice).estado = 0;

    System.out.println("El estado de la tarea se a midificado con exito" + listaDeTareas.get(indice));

}


//Eliminar tareas completadas
public void eliminarTareasCompletadas(){

    for(Tarea tarea : listaDeTareas){

        if(tarea.getEstado() == 0){
            listaDeTareas.remove(tarea);

        } 


    }

    System.out.println("Las tareas completadas se eliminaron con exito\n");

}


}
