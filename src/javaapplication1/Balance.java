/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Fran
 */
public class Balance {
    private float año;
    private float mes;
    private float dia;
    
    public Balance(float año, float mes, float dia){
        this.año = año;
        this.mes = mes; 
        this.dia = dia;
    }

    public float getAño() {
        return año;
    }

    public void setAño(float año) {
        this.año = año;
    }

    public float getMes() {
        return mes;
    }

    public void setMes(float mes) {
        this.mes = mes;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }
    
    public void balanceA(){ año += mes;}
    public void balanceM(){ mes += dia;}
    public void balanceD(Caja c){ dia += c.getDinero_caja();}
    
}
