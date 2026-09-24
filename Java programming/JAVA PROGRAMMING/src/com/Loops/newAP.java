package com.Loops;

import java.util.Scanner;

public class newAP {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first term:");
        int a = sc.nextInt();

        System.out.print("entter the difference:");
        int d = sc.nextInt();

        System.out.print("total terms:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++ ){
            
            System.out.println("the Ap is:"+" "+a);
            a+=d;
        }
        sc.close();
    }
    
}
