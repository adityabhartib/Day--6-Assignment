package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class MonthlyPayment {
    static void checkPayment(double rate,double years,double principal){
        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = scan.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rate = scan.nextDouble();
        System.out.println("Enter year : ");
        double years = scan.nextDouble();
        checkPayment(rate,years,principal);
    }
}