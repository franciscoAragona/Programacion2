/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Fran
 */
public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        boolean answ = false;
        // TODO code application logic here
        
        while (answ != true) {
            
            
        }

        Orden o = new Orden();
        //o.agregarProd(p1, p2, p3);
        //esto se debe haceren mla clase caja 
        Cuenta c = new Cuenta(o);
        c.mostrarC(c);
        
    }
    
}
