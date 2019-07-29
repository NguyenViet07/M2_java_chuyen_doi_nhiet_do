package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f,c;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. from C to F");
            System.out.println("2. from F to C");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter C: ");
                    c = input.nextDouble();
                    System.out.println("F : " + cToF(c));
                case 2:
                    System.out.print("Enter F: ");
                    f = input.nextDouble();
                    System.out.println("C: " + fToC(f));
                case 0:
                    System.exit(0);
            }
        } while ( choice !=0);
    }
    public static double cToF(double C){
        double F = (9.0/5)*C +32;
        return F;
    }
    public static double fToC(double F){
        double C = (F-32)*(5/9.0);
        return C;
    }
}
