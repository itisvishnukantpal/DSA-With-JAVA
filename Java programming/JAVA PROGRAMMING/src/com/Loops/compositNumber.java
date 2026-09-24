package com.Loops;

import java.util.Scanner;

public class compositNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number:");
        int n = sc.nextInt();

        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                System.out.println("the number is compisite number");
                break;
            }
        }

        sc.close();
    }
    
}
