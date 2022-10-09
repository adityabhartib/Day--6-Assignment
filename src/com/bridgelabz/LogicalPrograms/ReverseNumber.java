package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
    static void checkReverse(int num) {
        int r;
        while (num > 0) {
            r = num % 10;
            System.out.print(r);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scan.nextInt();
        checkReverse(num);
    }
}
