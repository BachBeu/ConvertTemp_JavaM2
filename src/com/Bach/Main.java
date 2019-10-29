package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F, C;
        int choice;
        System.out.println("**********Menu***********");
        System.out.println("* Fahrenheit to Celsius *");
        System.out.println("* Celsius to Fahrenheit *");
        System.out.println("*         Exit          *");
        System.out.println("*************************");
        System.out.println("Enter the choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter F: ");
                F = sc.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + FTC(F));
                break;
            case 2:
                System.out.println("Enter C: ");
                C = sc.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + CTF(C));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Invalid Input, Please try again");
        }
    }

    public static double CTF(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }
    public static double FTC(double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
