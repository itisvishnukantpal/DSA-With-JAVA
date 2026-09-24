package com.ifelesLacture;

import java.util.Scanner;

public class ProfitorLose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price:");
        double CP = sc.nextDouble();
        System.out.print("Enter the Selling price:");
        double SP = sc.nextDouble();
        if(CP < SP){
            System.err.println("Seller has made Profit :" + (SP-CP));
        }
        else if (CP > SP) {
            System.out.println("Seller incurred Loss:" + (CP-SP));
        }
        else {
            System.out.println("No profit No loss");
        }    
        sc.close();
    }
    
}
