package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class DecimalToBinary {
    static void checkBinary(int num) {
        int binary[] = new int[10];
        int i = 0;
        while(num > 0) {
            int r = num % 2;
            binary[i++] = r;
            num = num/2;
        }
        System.out.print("Binary number : ");
        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(binary[j]+"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        checkBinary(n);
    }
}