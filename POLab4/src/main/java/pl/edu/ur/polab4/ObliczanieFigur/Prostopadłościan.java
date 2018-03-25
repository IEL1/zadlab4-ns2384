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
public class Prostopadłościan {
    private double a, b, H;
    public Prostopadłościan(double a, double b, double H){
        this.a = a;
        this.b = b;
        this.H = H;
    }
    public double objetosc_prostopadloscianu(double a, double b, double H){
        return a*b*H;
    }
    
    public double pole_prostopadloscianu(double a, double b, double H){
        return 2*a*b+2*b*H+2*H*b;
    }
    public void wyswietlDane()
    {
        System.out.println("Pole prostopadłościanu: " +pole_prostopadloscianu(a,b,H));
        System.out.println("Objetość prostopadłościanu: " +objetosc_prostopadloscianu(a,b,H));
    }
}
