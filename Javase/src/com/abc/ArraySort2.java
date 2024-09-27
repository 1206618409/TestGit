package com.abc;

import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {1,5,4,6,9,7,8,3,2};
        /*
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    sort(arr,i,j);
                }
            }
        }
        */


        Arrays.sort(arr);
        print(arr);



    }
    public static void sort(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int[] print(int[]arr){
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1]+"\t");
        }
        return arr;
    }
}
