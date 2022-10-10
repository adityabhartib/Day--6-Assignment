package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        double epsilon = 1.0e-15;
        double t = n;
        while (Math.abs(t - n / t) > epsilon * t) {
            t = (n / t + t) / 2.0;
        }

        System.out.println(t);
    }
}
