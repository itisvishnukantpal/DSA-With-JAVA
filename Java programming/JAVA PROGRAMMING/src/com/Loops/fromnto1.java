package com.Loops;

import java.util.Scanner;

public class fromnto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of n:");
        int n = sc.nextInt();

        int i = n;
        for(i=n; i>=1; i--){
            System.out.println(i);
        }
        sc.close();
    }
    
}
