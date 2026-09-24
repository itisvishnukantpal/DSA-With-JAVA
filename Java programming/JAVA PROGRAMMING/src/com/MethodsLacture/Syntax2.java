package com.MethodsLacture;

public class Syntax2 { // it make infite loop

    public static void main(String[] args) {

        name();
        
    }
    public static void name() {

        System.out.println("Vishnu kant pal");

        branch();
        
    }
    public static void branch() {

        System.out.println("Computer Science ");

        spacilazition();
        
    }
    public static void spacilazition() {

        System.out.println("Data Science");

        samester();
        
    }
    public static void samester() {
         System.out.println("Five :- (V)");

         name();
        
    }
    
}
