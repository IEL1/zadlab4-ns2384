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
public class Prostokąt {
    private double a, b;
    public Prostokąt(double a, double b){
        this.a = a; 
        this.b = b;
    }
     public double obwod_prostokata(double a, double b){
        return 2*a+2*b;
    }
    
    public double pole_prostokata(double a, double b){
        return a*b;
    }
    public void wyswietlDane()
    {
        System.out.println("Obowd prostokąta: "+obwod_prostokata(a,b));
        System.out.println("Pole prostokąta: "+pole_prostokata(a,b));
    }
}
    
    

