package com.Loops;

import java.util.Scanner;

public class APprint {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N:");
        int n = sc.nextInt();

        System.out.print("The Recured AP is :");

        for(int i=2; i <= 3*n-1; i= i+3){
            System.out.print(" "+i);
        }
        sc.close();
    }
    
}
