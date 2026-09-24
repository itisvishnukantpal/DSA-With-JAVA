package com.ifelesLacture;

import java.util.Scanner;

public class Divisibleby5or3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();

        if(n%3 == 0 || n%5 == 0){
            System.out.println("this number is divisible by 5 or 3");
        }
        else{
            System.out.println(" this number is not divisible by 5 or 3");
        }

        sc.close();
    }
    
}
