package com.MethodsLacture;

public class Syntax {

    public static void vishnu(){

        System.out.println("My name is vishnu");
        
    }
    public static void main(String[] args) {
        
        System.out.println("hellow sir!");
        game();
        table();
    }
    public static void table(){

        for(int i = 1; i <= 50; i++) System.out.print(i + " ");
    }
    public static void hobby(){

        System.out.println("My hobby is gaming");

    }
    public static void game(){

        vishnu();

        hobby();

        System.out.println("I play BGMI");
    }
}
