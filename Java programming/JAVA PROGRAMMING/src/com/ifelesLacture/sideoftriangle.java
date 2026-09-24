package com.ifelesLacture;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int x = sc.nextInt();

        System.out.print("Enter the second number:");
        int y = sc.nextInt();

        System.out.print("Enter the third number:");
        int z = sc.nextInt();

        if((x+y > z) && (y+z > x) && (z+x > y)){
            System.out.println("They can be side of triangle");
        }
        else{
            System.out.println("They can not be the side of triangle");
        }
        
        sc.close();
    }
    
}
