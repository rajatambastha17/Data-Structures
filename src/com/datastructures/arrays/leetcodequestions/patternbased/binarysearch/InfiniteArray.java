package com.datastructures.arrays.leetcodequestions.patternbased.binarysearch;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 13, 15, 17, 19, 21, 24, 29, 32, 43, 45, 46, 47, 48, 49, 54, 78};
        int result = getIndexFromArray(arr, 43);
        System.out.print("Index: " + result);

    }

    public static int getIndexFromArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1; // this is the new start
            //To find end:
            //Double the box value
            //end=end+(end-(start-1))*2
            //end=end+(end-start+1)*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return index(arr, target, start, end);
    }

    public static int index(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}