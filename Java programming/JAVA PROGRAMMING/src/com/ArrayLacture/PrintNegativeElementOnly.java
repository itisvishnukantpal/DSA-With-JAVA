package com.ArrayLacture;

import java.util.Scanner;

public class PrintNegativeElementOnly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array Elements:");
        for(int i = 0; i <= n; i++)
            arr[i] = sc.nextInt();
        
        //printing negative values
        for(int i = 0; i < n; i++)

            System.out.print(arr[i] + " ");

            sc.close();
    }
    
}
