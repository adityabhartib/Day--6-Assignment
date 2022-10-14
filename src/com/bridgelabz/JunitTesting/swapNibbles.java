package com.bridgelabz.JunitTesting;

public class swapNibbles {
    public static void swapnibbles(){
        int arr[] = {0, 1, 1, 0, 0, 1, 0, 0};
        int index=4;
        System.out.print("Print Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<index;i++){
            int storeElements,j;
            storeElements=arr[0];
            for (j=0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=storeElements;
        }
        System.out.println();
        System.out.println("After Swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        swapnibbles();
    }
}

