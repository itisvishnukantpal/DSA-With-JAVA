package com.ifelesLacture;

import java.util.Scanner;

public class Divisibleby5orNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        if (n%5 == 0){
            System.out.println("The number is divisible");
        }
        else{
            System.out.println("The number is not divisible");
        }
        sc.close();

    }
}
    

