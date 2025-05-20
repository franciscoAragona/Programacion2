/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        boolean answ = false;
        boolean ready = false;
        Tienda t = new Tienda(0);
        ///CODIGO DE STATS: 000
        ///CODIGO DE CONFIGURACION: 123
        ///CODIGO DE CIERRE DE TIENDA: 321
        
        Scanner sc = new Scanner(System.in);
        
        while(answ != true){
            System.out.println("Ingrese 1 para cargar un cliente");
            int op = sc.nextInt();
            if(op == 1 && ready == true){
                t.ingreso_cliente(t);    
            }else if(op == 123){
                t.config_tienda(t);
                ready = true;
            }else if(op == 000){
                t.getBalance().estats(t);
            }else if(op == 321){
                answ = true;
            }else if(op == 1 && ready == false){
                System.out.println("Configure la tienda");
            }
        }
        
    }
    
    
}
