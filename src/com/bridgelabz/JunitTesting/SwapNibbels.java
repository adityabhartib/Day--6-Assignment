package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class SwapNibbels {
    static void checkBinary(int num) {
        int binary[] = new int[10];
        int i = 0;
        while (num > 0) {
            binary[i] = num % 2;
            num = num / 2;
            i++;
        }
        System.out.println("Binary number : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j] + "");
    }
    static int swapNibbles() {
        System.out.println("\n");
        System.out.println("After Swaping: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int right = (n & 0b00001111);
        right = (right << 4);
        int left = (n & 0b11110000);
        left = (left >> 4);
        return (right | left);
    }

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkBinary(num);
        System.out.println("After Swaping: " + swapNibbles());
    }
}