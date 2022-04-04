package com.datastructures.arrays.search;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.print("Input the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr));
    }

    static String findMax(int[] arr) {
        if(arr == null) {
            return "Array is null";
        }

        if(arr.length == 1) {
            return "Maximum element in the array: "+arr[0];
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return "Maximum element in the array: "+max;
    }
}
