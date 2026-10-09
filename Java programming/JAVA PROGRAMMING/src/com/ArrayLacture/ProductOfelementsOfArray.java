package com.ArrayLacture;

public class ProductOfelementsOfArray {

    public static void main(String[] args) {

        int[]arr = {2, 2, 2, 2, 2};

        int product = 1;

        for(int i = 0; i <= arr.length-1; i++){

            product = product * arr[i];

        }

        System.out.print(product);

    }
    
}
