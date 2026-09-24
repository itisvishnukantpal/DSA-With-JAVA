package com.Loops;

public class oddnumber1to100divisibleby3 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("the number is odd and devisible by 3 are:");
        for(i=1; i<=100; i++){
            if(i%2!=0 && i%3==0){
                System.out.print(" "+i);
            }
        }
    }
    
}
