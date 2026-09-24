package com.patternPrintinglacture;

import java.util.Scanner;

public class StarTriangleHorizontallyFlipped {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("entr the terms:");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
          //  for(int j = 1; j <= n-i+1; j++)
            for(int j = n; j>=i; j--)
                {

                System.out.print("*" + " ");


            }

            System.out.println();
        }


        sc.close();
    }
    
}
