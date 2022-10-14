package com.bridgelabz.JunitTesting;

import java.util.Arrays;

public class swapNibbles {
    static int[]swapNibbles(int[]arr){
        int temp,j= arr.length-4;
        for (int i=0;i<4;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int[]arr2={1,0,1,1,0,0,0,1};
        int[]arr3=swapNibbles(arr2);
        System.out.println(Arrays.toString(arr3));
    }
}

