package com.Lacture1;

public class CharDetatype {
    public static void main(String[]args){
        // typecasting - ek detatype ko desere detatype me convert kerna

        char CH = 'A'; // char detatype ko single quts me aur ek hi letter me likhte hi

        int x = CH; // implicit typecasting

        System.out.println(x);

        char vis = 'B';
        int y = (int)vis; // explicit typecasting
        System.out.println(y);
    }
    
}
