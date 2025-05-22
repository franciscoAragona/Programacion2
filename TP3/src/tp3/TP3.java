/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear instancia de ListaTareas
        ListaTareas lista = new ListaTareas();

        // 1. Agregar al menos 3 tareas a la lista
        Tarea t1 = new Tarea("Tarea 1", "Descripción 1", false);
        Tarea t2= new Tarea("Tarea 2", "Descripción 2", false);
        Tarea t3 = new Tarea("Tarea 3", "Descripción 3", false);
        lista.getLista_tareas().add(t1);
        lista.getLista_tareas().add(t2);
        lista.getLista_tareas().add(t3);

        // 2. Mostrar todas las tareas
        System.out.println("-- Mostrar todas las tareas --");
        lista.mostrar_tareas(lista);

        // 3. Buscar si una tarea específica está en la lista
        System.out.println("\n-- Buscar si existe t2 --");
        boolean existe = lista.contiene_tarea(lista, t2);
        System.out.println("¿Contiene t2? " + existe);

        // 4a. Eliminar una tarea por su índice
        System.out.println("\n-- Eliminar tarea por índice (índice de t1) --");
        int idx = lista.indice_tarea(lista, t1);
        if (idx >= 0) {
            lista.getLista_tareas().remove(idx);
            System.out.println("Eliminada t1 en índice " + idx);
        }
        lista.mostrar_tareas(lista);

        // 4b. Eliminar una tarea por el objeto (t3)
        System.out.println("\n-- Eliminar tarea por objeto (t3) --");
        lista.eliminar_tarea(lista, t3);
        lista.mostrar_tareas(lista);

        // 5. Verificar si la lista está vacía después de vaciarla
        System.out.println("\n-- Vaciar lista y verificar si está vacía --");
        lista.clear_tarea(lista, null);
        System.out.println("¿Lista vacía? " + lista.vacia_tarea(lista, null));

        // 6. Clonar la lista y trabajar con la copia
        System.out.println("\n-- Clonar lista y modificar copia --");
        // Primero, volvemos a agregar tareas originales
        lista.getLista_tareas().add(t1);
        lista.getLista_tareas().add(t2);
        lista.getLista_tareas().add(t3);
        ArrayList<Tarea> copia = lista.clonar_tarea(lista, null);
        System.out.println("Original antes de modificar copia:");
        lista.mostrar_tareas(lista);

        // Modificar copia
        copia.remove(t2);
        System.out.println("Copia después de eliminar t2:");
        for (Tarea t : copia) {
            t.mostrar_tarea(t);
        }

        System.out.println("Original después de modificar copia (debe incluir t2):");
        lista.mostrar_tareas(lista);
    }
    }
    

