/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_ass_104;
import java.util.Scanner;

/**
 *
 * @author Augustus
 */
public class Java_ass_104 {

    public static void main(String[] args) {
        
        //Assignment Program1
        System.out.println("oOOO()");
        System.out.println("/_)");
        System.out.println("|(");
        System.out.println("\\)()OOOo");
        System.out.println("    (_\\ ");
        System.out.println("      )  ");
        System.out.println("oOOO() (/");
        System.out.println("/_)");
        System.out.println("|(");
        System.out.println("\\)()OOOo");
        System.out.println("    (_\\" );
        System.out.println("     )  " );
        System.out.println("      (/" );
        
        
        
        //Assignment Program2
        Scanner typing = new Scanner(System.in);
        int num;
        System.out.println("Type a number please");
        num = typing.nextInt();
        if( num >= 80 ){
         System.out.println("More than 80%");
        }else if( num >= 60 ){
         System.out.println("More than 60%");
        }else if( num >= 40 ){
         System.out.println("Average");
        }else{
         System.out.println("Failed");
        }
        
    
         //Assignment Program3
         Double num2;
         Double pi = 3.14;
         Double area;
         System.out.println("Type a radius please");
         num2 = typing.nextDouble();
         if(num2 > 0){
             area = pi*num2*num2;
        System.out.println("area=" +area);
         }else{
        System.out.println("Negative input");
         }
         
}
}