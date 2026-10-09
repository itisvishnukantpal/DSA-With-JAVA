package com.ArrayLacture;

public class MAximumElementOfArray {

    public static void main(String[] args) {
        
        int[] arr = {2, -5, 7, 9 , 57};

        int max = arr[0];

        for(int i = 0; i <= arr.length-1; i++){

            if(arr[i] > max) 
                
                max = arr[i];
        }

        System.out.println(max);

    }
    
}
