package com.datastructures.arrays.search.questionpatterns;

import java.util.Scanner;

/*
Here we will apply the approach of binary search to get the desired output
 */
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number of which ceiling need to be found:");
        int[] arr = {12, 13, 14, 16, 18, 20, 23, 26, 28, 45, 67};
        int n = s.nextInt();
        if (n > arr[arr.length - 1]) {
            System.out.println("Please input a number in range of the array!");
        } else {
            int result = ceilingOfNumber(arr, n);
            System.out.println("Ceiling of the number " + n + " from the array is " + result);
        }
    }

    public static int ceilingOfNumber(int[] arr, int target) {
        int start_index = 0;
        int end_index = arr.length - 1;

        while (start_index <= end_index) {
            int mid = start_index + (end_index - start_index) / 2;
            if (target > arr[mid]) {
                start_index = mid + 1;
            } else if (target < arr[mid]) {
                end_index = mid - 1;
            } else {
                return target;
            }
        }
        return arr[start_index];
    }
}
