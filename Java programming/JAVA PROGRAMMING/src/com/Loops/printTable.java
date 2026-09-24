package com.Loops;

import java.util.Scanner;

public class printTable {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int i = 1;
        System.out.print("Enter tne table number:");
        int n = sc.nextInt();

        for(i=1; i<=10; i++){
            System.out.println(n*i+" ");
        }
        sc.close();

    }
}
