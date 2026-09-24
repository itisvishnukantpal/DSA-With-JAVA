package com.Loops;

import java.util.Scanner;

public class Ntimes{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your Name:");
        String name = sc.nextLine();

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        int i =1;

        for(i = 1; i <= n; i++){
            System.out.println(name);
        }

        sc.close();
    }
    
}
