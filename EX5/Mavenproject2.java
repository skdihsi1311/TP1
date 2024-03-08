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

//EX5 TP1
public class Mavenproject2 {

    public static void main(String[] args) {
 
          System.out.println("Entrer un entier :");
          Scanner in = new Scanner(System.in);
          int n=in.nextInt();
          int factor=1;
            for (int i=1;i<=n;i++){
                factor=i*factor;
            }
            System.out.println("La factorielle de "+n +" est : "+factor);
        
    }
}
