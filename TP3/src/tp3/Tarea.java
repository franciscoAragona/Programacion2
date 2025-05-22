/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Fran
 */
public class Tarea {
    private String nombre;
    private String descripcion;
    private Boolean completada = false;

    public Tarea(String nombre, String descripcion, Boolean completada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
    
    public void completar_tarea(Tarea t){
        t.setCompletada(true);
    }
    public void mostrar_tarea(Tarea t){
        System.out.println("Tarea: "+t.getNombre()+". Descripcion: "+t.getDescripcion()+". Completada: "+ t.getCompletada());
    }
}
