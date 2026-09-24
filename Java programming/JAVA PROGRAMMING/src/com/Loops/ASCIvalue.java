package com.Loops;

import java.util.Scanner;

public class ASCIvalue {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=32; i<=n; i++){
            System.out.println((char)i + ":-" +i);
        }
        sc.close();

    }
    
}
