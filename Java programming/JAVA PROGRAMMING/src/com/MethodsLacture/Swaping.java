package com.MethodsLacture;

import java.util.Scanner;

public class Swaping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("enter the first number:");
        int a = sc.nextInt();

        System.out.print("ener the second number:");
        int b = sc.nextInt();

        System.out.println(a +" "+ b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);

         sc.close();

    }
    
}
