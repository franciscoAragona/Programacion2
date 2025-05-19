/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fran
 */
public class Cocina {
    private int demoraXplato = 10;

    public int getDemoraXplato() {
        return demoraXplato;
    }

    public void setDemoraXplato(int demoraXplato) {
        this.demoraXplato = demoraXplato;
    }

    public int o_demora(Orden o){return o.getL().size() * demoraXplato;}
    
}
