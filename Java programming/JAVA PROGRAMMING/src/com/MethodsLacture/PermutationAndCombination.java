package com.MethodsLacture;

import java.util.Scanner;

public class PermutationAndCombination {

    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tae value of n:");
        int n = sc.nextInt();

        System.out.print("enter the value of r:");
        int r = sc.nextInt();

        int nFact = 1;
        for(int i = 1; i <=n; i++){
            nFact = nFact*i;
        }
        int rFact = 1;
        for(int i = 1; i <=r; i++){
            rFact = rFact*i;
        }
        int nrFact = 1;
        for(int i = 1; i <=n-r; i++){
            nrFact = nrFact*i;
        }
        int ncr = nFact/(rFact*nrFact);

        System.out.println(ncr);


    
        sc.close();
    }*/

        public static int fact(int x){

            int f = 1;
            for(int i = 1; i <= x; i++ ){

                f *= i; 
            }
            return f;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = sc.nextInt();

            int ncr = fact(n)/(fact(r)*fact(n-r));
            int npr = fact(n)/(fact(n-r));

            System.out.println(ncr + " " + npr);
            
            sc.close();
        }
    
}
