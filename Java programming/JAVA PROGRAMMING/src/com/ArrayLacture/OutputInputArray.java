package com.ArrayLacture;

import java.util.Scanner;

public class OutputInputArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] arr = {5,8,7,9,-8,2,8,4,2,9};
        
        /*
        System.out.println(arr[0]); // isko short kerne ke leye loop lagayenge
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        */
         //for(int i = 0; i <= 5; i++)
        
        for(int i = 0; i < arr.length; i++){

        System.out.print(arr[i] + " ");

       }

       int [] defaultvalue = new int[7];
       // default value
       for(int i = 0; i < defaultvalue.length; i++){

        System.out.print(defaultvalue[i]+" ");
       }
       
       //input

       for(int i = 0; i < 7; i++){

        defaultvalue[i] = sc.nextInt();
       }

       //print

       for(int i = 0; i < 7; i++){

        System.out.println(2*defaultvalue[i]);
        
       }

       sc.close();

    }
    
}
