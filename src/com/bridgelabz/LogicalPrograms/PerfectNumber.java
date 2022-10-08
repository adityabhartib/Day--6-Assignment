package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    static void checkPerfectNumber(int num) {
        int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    sum = sum + i;
            }
        if (sum == num) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + "Not Perfect Number");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        checkPerfectNumber(num);
    }
}
