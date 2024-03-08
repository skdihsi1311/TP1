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

//EX3 TP1
public class Mavenproject2 {

    public static void main(String[] args) {
 
        System.out.println("Entrer deux entriers : ");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int t=a; // t : variable temporaire
        a=b;
        b=t;
        System.out.println("La valeur de a :"+a+" La valeur de b :"+b );
        
    }
}
