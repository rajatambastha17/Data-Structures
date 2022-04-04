package com.datastructures.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.print("Input the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before reversing: ");
        for (int element: arr) {
            System.out.print(element+" ");
        }

        System.out.print("\n" +
                "Array after reversing: ");
        arr = reverse(arr, 0, arr.length-1);
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }

    static int [] reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
