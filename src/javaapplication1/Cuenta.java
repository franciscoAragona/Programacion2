 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Fran
 */
public class Cuenta {
    private Orden o;
    private float Sprod = 0;
    
    public Cuenta(Orden o){
        this.o = o;    
    }

    public Orden getO() {
        return o;
    }

    public void setO(Orden o) {
        this.o = o;
    }

    public float getSprod() {
        return Sprod;
    }

    public void setSprod(float Sprod) {
        this.Sprod = Sprod;
    }
    
    public void mostrarC(Cuenta c){
        for (Producto p : c.getO().getL()){
            p.mostrarP();
            Sprod += p.getPrecio();
        }
        System.out.println("TOTAL: $"+ Sprod);
    }
    
}
