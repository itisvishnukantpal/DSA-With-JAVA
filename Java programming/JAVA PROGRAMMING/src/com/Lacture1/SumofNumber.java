package com.Lacture1;

import java.util.Scanner;

public class SumofNumber {
    public static void main(String[]args){
         System.out.print("Enter the first Number : ");
         Scanner sc = new Scanner(System.in);
         double x = sc.nextDouble();
         System.out.print("Enter the first Number : ");
         double y = sc.nextDouble();
          System.out.print("Enter the first Number : ");
         double z = sc.nextDouble();
         double Sum = x+y+z;
         System.out.println("Sum of numbers is : " + Sum);
         sc.close();
    }
    
}
