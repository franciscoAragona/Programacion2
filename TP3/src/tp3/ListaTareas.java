/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class ListaTareas {
    private ArrayList<Tarea> lista_tareas = new ArrayList();

    public ArrayList<Tarea> getLista_tareas() {
        return lista_tareas;
    }

    public void setLista_tareas(ArrayList<Tarea> lista_tareas) {
        this.lista_tareas = lista_tareas;
    }
    
    public void agregar_tarea(ListaTareas lista){
        System.out.println("agregar_tarea");
        Scanner sc = new Scanner(System.in);
        Boolean answ = false;
        
        while (answ == false){
            System.out.println("1 ingresar | 0 salir");
            int op = sc.nextInt();
            if(op == 0){
                answ = true;
            }else if(op == 1){
                System.out.print("Nombre");
                String nombre = sc.nextLine();
                System.out.print("Descripcion");
                String descripcion = sc.nextLine();
                Tarea tarea = new Tarea(nombre, descripcion, false);  
                lista.getLista_tareas().add(tarea);
            }           
        }
    }
    
    public void mostrar_tareas(ListaTareas lista){
        System.out.println("mostrar_tareas");
        for( Tarea tarea : lista.getLista_tareas()){
            tarea.mostrar_tarea(tarea);
        }
    }
    
    public Tarea obtener_tarea(ListaTareas lista){
        System.out.println("obtener_tarea");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre");
        String n = sc.nextLine();
        for( Tarea tarea : lista.getLista_tareas()){
            if(tarea.getNombre().equals(n)){
                return tarea;
            }
        }
        return null;
    }
    
    public Boolean contiene_tarea(ListaTareas lista, Tarea t){
        System.out.println("contiene_tarea");
        if(lista.getLista_tareas().contains(t)){
            return true;
        }    
        return false;
    }
    
    public int indice_tarea(ListaTareas lista, Tarea t){
        return lista.getLista_tareas().lastIndexOf(t);
    }
    
    public void eliminar_tarea(ListaTareas lista, Tarea t){
        lista.getLista_tareas().remove(t);
    }
    public void clear_tarea(ListaTareas lista, Tarea t){
        lista.getLista_tareas().clear();
    }
    
    public Boolean vacia_tarea(ListaTareas lista, Tarea t){
        return lista.getLista_tareas().isEmpty();
    }
    
    public ArrayList<Tarea> clonar_tarea(ListaTareas lista, Tarea t){
        return (ArrayList<Tarea>) lista.getLista_tareas().clone();
    }
}
