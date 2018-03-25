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
public class Koło {
    private double R;
    public Koło(double R){
        this.R = R; 
    }
     public float obwod_koła(double R){
        return (float) (2*3.14*R);
    }
    
    public double pole_koła(double R){
        return 3.14*R*R;
    }
    public void wyswietlDane()
    {
        System.out.println("Pole koła: "+pole_koła(R));
        System.out.println("Obwód koła: "+obwod_koła(R));
    }
}
