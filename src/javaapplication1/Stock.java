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

    public List<prodStock> getS() {
        return s;
    }

    public void setS(List<prodStock> s) {
        this.s = s;
    }
    
    public void delStock(Orden o, Tienda t){
        for (Producto p: o.l){
            for (prodStock ps: t.getStockTienda().getS()){
                if (p.getNombre().equals(ps.getNombre())){
                    ps.setCantp(ps.getCantp()-1);
                }
            } 
        }
    }
    
    public void addStock(Tienda t, List<Producto> s){
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        for (Producto p: s){
            for (prodStock ps: t.getStockTienda().getS()){
                if (p.getNombre().equals(ps.getNombre())){
                    System.out.println("Add a: "+ p.mostrarP());
                    cant = sc.nextInt();
                    ps.setCantp(ps.getCantp()+cant);
                }
            } 
        }
    }
    
    public void createStock(Tienda t){
        Scanner sc = new Scanner(System.in);
        for (Producto p: t.getMenu()){
            int cant = 0;
            System.out.println(" cantidad de: "+ p.mostrarP());
            cant = sc.nextInt();
            prodStock ps = new prodStock(p.getNombre(), p.getPrecio(), cant);
            t.getStockTienda().s.add(ps);
        }
    }
    
    public boolean checkStock(Producto prod, List<prodStock> s){
        for (prodStock ps: s){
            if (ps.getNombre().equals(prod.getNombre())){
                ps.setCantp(ps.getCantp()-1);
                return true;
            }   
        }
        return false;
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