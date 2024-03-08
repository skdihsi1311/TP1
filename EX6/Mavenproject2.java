/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX6 TP1
public class Mavenproject2 {

    public static void main(String[] args) {
 
        System.out.println("Entrer la valeur de a et b successivement:");
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        System.out.printf("l'equation :%.0fx + %.0f = 0 a une solution unique: %f",a,b,-b/a);
        
    }
}
