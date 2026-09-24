package com.Loops;

import java.util.Scanner;

public class primeNumberORnot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number:");
        int n = sc.nextInt();
        int i;

        if (n >= 2) {

            for( i = 2; i < n; i++){
                if(n % i == 0){
                    break;
        
                }
            }
            if ( i == n ) {
                
                System.out.println("is prime");
            }else{
                System.out.println("is not prime");
            }
            
        }
        else{
            System.out.println("is not prime");
        }

        sc.close();
    }
}

