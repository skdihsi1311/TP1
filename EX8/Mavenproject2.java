/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX8 TP1
public class Mavenproject2 {

    public static void main(String[] args) {
 
         System.out.println("Entrer deux entiers a et b successivement");
         Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int b=in.nextInt();
         int pgcd=1;
            for(int i=1;i<=min(a,b);i++){
                if(a%i==0 && b%i==0){
                    pgcd=i;
                }
            }
        System.out.println("Le pgcd : "+ pgcd);
    
    }       
}
