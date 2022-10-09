package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        double epsilon = 1.0e-15;  // relative error tolerance
        double t = n;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - n / t) > epsilon * t) {
            t = (n / t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
