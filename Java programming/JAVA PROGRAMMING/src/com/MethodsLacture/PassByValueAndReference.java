package com.MethodsLacture;

public class PassByValueAndReference {

    public static void change(int x){

        x = 10;

    }

    public static void main(String[] args) {
        
        int x = 7;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    
}
