package com.ifelesLacture;

import java.util.Scanner;

public class positiveIntegerdivide {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number:");
        int a = sc.nextInt();

        if((a%3 == 0) && (a%5 == 0)){
            System.out.println("Divisibale by both");
        }else if(a%3 == 0){
            System.out.println("divisible by 3");    
        }else if(a%5 == 0){

            System.out.println("Divisibe by 5");
        }else{
            System.out.println("Not divisible by both");
        }
        
        sc.close();

    }
    
}
