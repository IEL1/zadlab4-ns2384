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
public class Sześcian {
    private double a;
    public Sześcian(double R){
        this.a = a;   
    }
     public double objetosc_szescianu(double a){
        return a*a*a;
    }
    
    public double pole_szescianu(double a){
        return 6*a*a;
    }
     public void wyswietlDane()
    {
        System.out.println("Pole sześcianu: " +pole_szescianu(a));
        System.out.println("Objetość sześcianu: " +objetosc_szescianu(a));
    }
    
}
