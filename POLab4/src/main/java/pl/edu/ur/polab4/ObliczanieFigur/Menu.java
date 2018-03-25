/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.ObliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class Menu {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.println("Wybierz figure: \n1.Koło \n2.Kwadrat \n3.Prostokąt \n4.Sześcian n5.Prostopadłościan \n6.Kula \n7.Stozek");
      int wybierz = scanner.nextInt();
     switch (wybierz) {
          case 1:
              System.out.println("Podaj promien koła: ");
              float R =scanner.nextInt();
              Koło koło = new Koło(R);
              koło.wyswietlDane();
              break;
    

         case 2:
              System.out.println("Podaj długość boku kwadratu: ");
              float bok = scanner.nextInt();
              Kwadrat kwadrat = new Kwadrat(bok);
              kwadrat.wyswietlDane();
              break;
              
          case 3:
              System.out.println("Podaj długość a boku prostokąta: ");
              float a = scanner.nextInt();
              System.out.println("Podaj dlugosc boku b prostokąta: ");
              float b = scanner.nextInt();
              Prostokąt prostokąt = new Prostokąt(a,b);
              prostokąt.wyswietlDane();
              break;
          case 4: 
              System.out.println("Podaj dlugosc krawędzi sześcianu: ");
              float krawedz_sz = scanner.nextInt();
              Sześcian sześcian = new Sześcian(krawedz_sz);
              sześcian.wyswietlDane();
              break;
          case 5:
              System.out.println("Podaj dlugosc krawędzi podstawy prostopadłościanu: ");
              float kr_podst = scanner.nextInt();
              System.out.println("Podaj dlugosc krawędzi bocznej prostopadłościanu: ");
              float kr_bok = scanner.nextInt();
              System.out.println("Podaj dlugosc wysokości prostopadłościanu: ");
              float wys = scanner.nextInt();
              Prostopadłościan prostopadłościan = new Prostopadłościan(kr_podst, kr_bok, wys);
              prostopadłościan.wyswietlDane();
              break;
          case 6:
              System.out.println("Podaj dlugosc promienia kuli: ");
              float r = scanner.nextInt();
              Kula kula = new Kula(r);
              kula.wyswietlDane();
              break;
          case 7:
              System.out.println("Podaj długość promienia postawy stożka: ");
              float R_st = scanner.nextInt();
              System.out.println("Podaj długość tworzącej stożka: ");
              float l = scanner.nextInt();
              Stożek stożek = new Stożek(R_st, l);
              stożek.wyswietlDane();
              break;
      }
    }
}
