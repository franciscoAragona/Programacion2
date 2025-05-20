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

public class Balance extends Stock {
    private int platosVendidos = 0;

    public int getPlatosVendidos() {
        return platosVendidos;
    }

    public void setPlatosVendidos(int platosVendidos) {
        this.platosVendidos = platosVendidos;
    }
    
    @Override
    public void createStock(Tienda t){
        for (Producto p: t.getMenu()){
            prodStock ps = new prodStock(p.getNombre(), p.getPrecio(), 0);
            t.getBalance().getS().add(ps);
        }
    }
    
    public void addBalance(Tienda t, Orden o){
        t.getBalance().setPlatosVendidos(t.getBalance().getPlatosVendidos() + o.getL().size());
        for (Producto p: o.getL()){
            for (prodStock ps: t.getBalance().getS()){
                if (p.getNombre().equals(ps.getNombre())){
                    ps.setCantp(ps.getCantp()+1);
                }
            } 
        }
    }
    
    public void estats(Tienda t){
        System.out.println("Se han vendido "+t.getBalance().getPlatosVendidos()+" platos");
        if(t.getBalance().getPlatosVendidos() != 0){
            for(prodStock ps: t.getBalance().getS()){
            System.out.println("Un " + (ps.getCantp()/t.getBalance().getPlatosVendidos())*100 + "% son " + ps.getNombre());
            }
        }    
    }
}

