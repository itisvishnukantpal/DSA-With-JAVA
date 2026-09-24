package com.ifelesLacture;

import java.util.Scanner;

public class IntegerorNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        double x = sc.nextDouble();
        int n =(int)x;
        if(x-n == 0){
            System.out.println("this is an integer");
        }
        else{
            System.out.println("this is not an integer");
        }
        sc.close();
    }
    
}
