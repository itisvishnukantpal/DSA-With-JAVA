package com.ArrayLacture;

public class SumOfElementsOfArray {

    public static void main(String[] args) {

        int []arr = {-6, 8, 14, -2, 23, 47, -7};

        int sum = 0;


        for(int i = 0; i <= arr.length-1; i++){
            
            sum += arr[i];

        }

        System.out.print(sum + " ");
        
    }
    
}
