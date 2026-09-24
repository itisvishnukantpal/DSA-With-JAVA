package com.MethodsLacture;

public class ReturnIsmandatory {
    
    public static void main(String[] args) {
        System.out.println(Priyanka(8));
    }
    public static int Priyanka(int a){
        if(a > 5){
            return a;
        }else{
            return -9;
        }
    }
}
