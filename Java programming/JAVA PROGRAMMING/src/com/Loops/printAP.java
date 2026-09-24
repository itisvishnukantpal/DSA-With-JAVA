package com.Loops;

import java.util.Scanner;

public class printAP {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of terms:");
        int n = sc.nextInt();
        System.out.println("the recqured AP is:");
        int a=2, d=3;
        for(int i=1; i<=n; i++){
            System.out.print(" "+a);
            a += d;
        }
        sc.close();
    }
}