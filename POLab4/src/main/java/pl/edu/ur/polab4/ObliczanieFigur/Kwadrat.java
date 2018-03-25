/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.ObliczanieFigur;

/**
 *
 * @author Natalia
 */
public class Kwadrat {
    private double a;
    public Kwadrat(double a){
        this.a = a;   
    }
    public double obwod_kwadratu(double a){
        return 4*a;
    }
    
    public double pole_kwadratu(double a){
        return a*a;
    }
    public void wyswietlDane()
    {
        System.out.println("Obowód kwadratu: "+obwod_kwadratu(a));
        System.out.println("Pole kwadratu: "+pole_kwadratu(a));
    }
    
}
