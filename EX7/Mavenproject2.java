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

//EX7 TP1
public class Mavenproject2 {

    public static void main(String[] args) {
 
         System.out.println("Entrer a , b et c successivemet : ");
         Scanner in=new Scanner(System.in);
         float a=in.nextFloat();
         float b=in.nextFloat();
         float c=in.nextFloat();
         double delta=pow(b,2)+4*a*c;   
             if(delta>0){
                System.out.printf("L'equation : %.0fx^2 + %.0fx + %.0f = 0 admet 2 solutions : ",a,b,c);             
                System.out.println("Solution 1 est : "+(-b-sqrt(delta))/(2*a) +" Solution 2 est : "+(-b+sqrt(delta))/(2*a) );                               
             }
             else if(delta==0){
             System.out.printf("L'equation : %.0fx^2 + %.0fx + %.0f = 0 admet 1 solution  : ",a,b,c);             
             System.out.println("Le Solution est : "+(-b/2*a));  
             }
             else{
                 System.out.println("Pas de solutions reels");
             }
    }       
}
