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
public class Kula {
    double R;
    public Kula(double R){
        this.R = R;
    }
    public double pole_kuli(double R){
        return 4*3.14*R*R;
    }
    
    public double objetosc_kuli(double R){
        return 4/3*3.14*R*R*R;
    }
     public void wyswietlDane()
    {
        System.out.println("Pole kuli: " +pole_kuli(R));
        System.out.println("Objetość kuli: " +objetosc_kuli(R));
    }
}
