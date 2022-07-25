package com.datastructures.arrays.leetcodequestions.easy.patternbased.binarysearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5, 4, 3, 2};
        System.out.println(peakIndexAndElement(arr));
    }

    public static String peakIndexAndElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return "Index number "+start+" contains the peak element : "+arr[start];
    }
}
