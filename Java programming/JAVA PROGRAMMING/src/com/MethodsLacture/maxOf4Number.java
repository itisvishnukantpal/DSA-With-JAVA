package com.MethodsLacture;

import java.util.Scanner;

public class maxOf4Number {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Result is:" + Math.max(Math.max(Math.max(a, b), c), d));

        sc.close();
    }
    
}
