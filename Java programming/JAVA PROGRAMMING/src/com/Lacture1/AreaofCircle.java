package com.Lacture1;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[]args){
        //area of circle ka farmula (pi*r*r) hota hi
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radious:");
        double r = sc.nextDouble();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.print("Area of circle is: " + area);
        sc.close();
    }
    
}
