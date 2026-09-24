package com.Lacture1;

import java.util.Scanner;

public class SquareofaNumber {
    public static void main(String[]args){
        // square of  a number is: r*r
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        double r = sc.nextDouble();
        double Squre = r*r;
        System.out.println("Squre of the given Number is :" + Squre);
        sc.close();
    }
    
}
