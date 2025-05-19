/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Fran
 */

public class Caja {
    private float dinero_caja;

    public Caja(float dinero_caja) {
        this.dinero_caja = dinero_caja;
    }

    public float getDinero_caja() {
        return dinero_caja;
    }

    public void setDinero_caja(float dinero_caja) {
        this.dinero_caja = dinero_caja;
    }
   
    public Cuenta emitirCuenta(Orden o){
        Cuenta c = new Cuenta(o);
        c.mostrarC(c);
        dinero_caja += c.getSprod();
        return c;
    }
}




