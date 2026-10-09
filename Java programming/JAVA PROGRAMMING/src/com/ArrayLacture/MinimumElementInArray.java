package com.ArrayLacture;

public class MinimumElementInArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,1};

        int min = arr[0];

        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] < min)

                min = arr[i];
        }

        System.out.println(min);
    }
    
}
