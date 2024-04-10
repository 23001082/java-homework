/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundinterest;

import java.util.Scanner;


public class CompoundInterest {

    
    public static void main(String[] args) {
   Scanner ampfa=new Scanner(System.in);
   double A,P,I,N;
   
   System.out.println("Enter the principal amount");
   P=ampfa.nextDouble();
   
   System.out.println("Enter the the annual interest rate");  
   I=ampfa.nextDouble();
   
    System.out.println("Enter the period");
    N=ampfa.nextDouble();
    
    A = P * Math.pow((1+I/100),N);
     System.out.println("The final amswer is" +A);

    }
    
}
