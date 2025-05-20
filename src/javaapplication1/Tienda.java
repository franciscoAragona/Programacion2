package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Tienda {
    private int clientes;
    private ArrayList<Producto> menu = new ArrayList();
    private Stock stockTienda = new Stock();
    private Caja caj = new Caja(0);
    private Cocina coci = new Cocina();
    private Balance balance = new Balance();
    
    public Tienda(int clientes) {
        this.clientes = clientes;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
    
    public Cocina getCoci() {
        return coci;
    }

    public void setCoci(Cocina coci) {
        this.coci = coci;
    }
        
    public Caja getCaj() {
        return caj;
    }

    public void setCaj(Caja caj) {
        this.caj = caj;
    }
    
    public Stock getStockTienda() {
        return stockTienda;
    }

    public void setStockTienda(Stock stockTienda) {
        this.stockTienda = stockTienda;
    }
    
    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Producto> menu) {
        this.menu = menu;
    }
    
    public void Menu(Tienda t){
        Scanner sc = new Scanner(System.in);
        boolean answ = false;
        String nombre;
        int precio; 
        while(answ != true){
            System.out.println("1 para ingresar un producto (nombre, precio) /// 0 para salir");
            int op = sc.nextInt();
            sc.nextLine();
            if(op == 1){
                System.out.println("nombre ");
                nombre = sc.nextLine();
                System.out.println("precio ");
                precio = sc.nextInt();
                Producto p = new Producto(nombre, precio);
                t.getMenu().add(p);
            }else if(op == 0){
                answ = true;
            }
        }
    }
    
    public void showMenu(Tienda t){
        System.out.println("---MENÚ---");
        int c = 0;
        for(Producto p : t.getMenu()){
            c+=1;
            System.out.println(c+". "+p.mostrarP());
        }
    }
    
    public void modifyMenu(Tienda t){
        showMenu(t);
        Scanner sc = new Scanner(System.in);
        String nombre;
        int precio;
        
        System.out.println("ingrese la posicion del producto a modificar");
        int op = sc.nextInt();
        if(op <= t.getMenu().size()){
            nombre = sc.nextLine();
            precio = sc.nextInt();
            Producto p = new Producto(nombre, precio);
            t.getMenu().set(op-1, p); 
        }
    }
    
    public void ingreso_cliente(Tienda t){
        System.out.println("WELCOME!!!");
        t.setClientes(t.getClientes()+1);
        Orden o = new Orden();
        o.agregarProd(t,o);
        System.out.println("LA DEMORA DE SU ORDEN ES: "+t.getCoci().o_demora(o));
        t.getCaj().emitirCuenta(o);      
    }
    
    public void config_tienda(Tienda t){
        boolean answ = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("CONFIGURACION DE TIENDA");
        System.out.println("Para las opciones 2 y 3 ya debe estar inicializada la tienda");
        System.out.println("1. Inicializar tienda");
        System.out.println("2. addStock");
        System.out.println("3. Salir");
        while(answ != true){
            System.out.print("Seleccione una opción: ");
            int op = sc.nextInt();
            if(op == 1){
                t.Menu(t);
                t.getStockTienda().createStock(t);
                t.getBalance().createStock(t);
            }else if(op == 2){
                t.stockTienda.addStock(t, t.getMenu());
            }else if(op == 3){
                answ = true;
            }
        }
        
        
        
         
    }   
}
