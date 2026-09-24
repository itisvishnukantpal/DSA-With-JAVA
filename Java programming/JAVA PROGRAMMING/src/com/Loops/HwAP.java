package com.Loops;

import java.util.Scanner;

public class HwAP {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = 99, d = 4;

        for(int i=99; i>=0; i-=4 ){
            System.out.println(" "+a);
            a-=d;
        }
        sc.close();
    }
    
}
