package com.MethodsLacture;

import java.util.Scanner;

public class MaxofThreeNumberBuiltin {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("result is:9" + Math.max(Math.max(a, b), c));


        sc.close();
    }
    
}
