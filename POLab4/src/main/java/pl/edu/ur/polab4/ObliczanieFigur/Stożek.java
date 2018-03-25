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
public class Stożek {
    double R, l;
    public Stożek(double R, double l){
        this.R = R;
        this.l = l;
    }
    public double objetosc_stożka(double R, double l){
        return 1/3*3.14*R*R*l;
    }
    
    public double pole_stozka(double R, double l){
        return 3.14*R*R+3.14*R*l;
    }
     public void wyswietlDane()
    {
        System.out.println("Pole stożka: " +pole_stozka(R,l));
        System.out.println("Objetość stożka: " +objetosc_stożka(R,l));
    }
}
