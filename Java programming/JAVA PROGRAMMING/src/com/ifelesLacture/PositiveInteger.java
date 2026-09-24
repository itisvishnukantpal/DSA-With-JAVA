package com.ifelesLacture;

import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n = sc.nextInt();
        if(n >= 0){
            System.out.print(n);
        }
        else{
            System.out.println(-n);
        }
        sc.close();

    }
    
}
