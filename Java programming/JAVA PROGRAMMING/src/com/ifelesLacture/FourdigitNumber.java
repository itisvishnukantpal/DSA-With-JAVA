package com.ifelesLacture;

import java.util.Scanner;

public class FourdigitNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("the number is a four digit integer");
        }
        else{
            System.out.println("the number is not a four digit integer");
        }
        sc.close();
    }
    
}
