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
public class Stock {
    List<prodStock> s = new ArrayList<prodStock>();
    
    
    public void delStock(Orden o, List<prodStock> s){
        for (Producto p: o.l){
            for (prodStock ps:s){
                if (p.getNombre().equals(ps.getNombre())){
                    ps.setCantp(ps.getCantp()-1);
                }
            } 
        }
    }
    
    public void addStock(Orden o, List<prodStock> s){
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        for (Producto p: o.l){
            for (prodStock ps:s){
                if (p.getNombre().equals(ps.getNombre())){
                    System.out.println(" cantidad de: "+ p.mostrarP());
                    cant = sc.nextInt();
                    ps.setCantp(ps.getCantp()+cant);
                }
            } 
        }
    }
    
    public void createStock(Orden o, Tienda t){
        Scanner sc = new Scanner(System.in);
        
        for (Producto p: o.l){
            int cant = 0;
            
            System.out.println(" cantidad de: "+ p.mostrarP());
            cant = sc.nextInt();
            prodStock ps = new prodStock(p.getNombre(), p.getPrecio(), cant);
                
        }
    }
    
    public String checkStock(Producto prod, List<prodStock> s){
        for (Producto p: s){
            if (p.getNombre().equals(prod.getNombre())){
                return "OK";
            }   
        }
        return "NO HAY";
    }
}

class prodStock extends Producto {
    private int cantp;
    
    public prodStock(String nombre, int precio, int cantp){
        super(nombre, precio);
        this.cantp = cantp;
    }

    public int getCantp() {
        return cantp;
    }

    public void setCantp(int cantp) {
        this.cantp = cantp;
    }
    
}