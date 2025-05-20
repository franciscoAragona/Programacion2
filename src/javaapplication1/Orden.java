/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Orden {
    
    public List<Producto> l = new ArrayList<Producto>();   

    public List<Producto> getL() {
        return l;
    }

    public void setL(List<Producto> l) {
        this.l = l;
    }

    public Orden agregarProd(Tienda t, Orden o) {
        Scanner sc = new Scanner(System.in);
        boolean answ = false;
        t.showMenu(t);
        System.out.println("0 para salir");
        while (answ != true) {
            int op = sc.nextInt();
            if(op > 0 && op <= t.getMenu().size()){
                if(t.getStockTienda().checkStock(t.getMenu().get(op-1),t.getStockTienda().getS()) == true){
                    o.getL().add(t.getMenu().get(op-1));
                }else{
                    System.out.println("NO HAY STOCK "+t.getMenu().get(op-1).mostrarP());
                }
                
            }else if(op == 0){
                answ = true;
            }
        }
        t.getStockTienda().delStock(o, t);
        t.getBalance().addBalance(t, o); 
        return o;
    }
    
}
