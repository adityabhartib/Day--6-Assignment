package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
    static void checkprimenumber(int num){
        int count=0;
        for (int i=2;i<num;i++) {
            if (num % i == 0)
                count++;
            break;
        }
            if (count == 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=scan.nextInt();
        checkprimenumber(num);
    }
}
