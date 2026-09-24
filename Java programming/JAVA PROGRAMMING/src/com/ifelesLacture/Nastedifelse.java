package com.ifelesLacture;

import java.util.Scanner;

public class Nastedifelse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number:");
        int x = sc.nextInt();

        System.out.print("enter the second number:");
        int y = sc.nextInt();

        System.out.print("enter the third number:");
        int z = sc.nextInt();

        if(x>=y && x>=z){
            System.out.println("gratest number is:" + x);
        }else if(y>=x && y>=z){
            System.out.println("gratest number is:" + y);
        }else{
            System.out.println("gratest number is:" + z);
        }

        sc.close();
    }
    
}
