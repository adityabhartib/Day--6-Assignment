package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    static void checkFibonacci(int num) {
        int a = 0, b = 1, nextterm;
        System.out.println(a + " ," + b + ",");
        for (int i = 2; i <= num; i++) {
            nextterm = a + b;
            a = b;
            b = nextterm;
            System.out.print(nextterm + ",");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scan.nextInt();
        checkFibonacci(num);
    }
}