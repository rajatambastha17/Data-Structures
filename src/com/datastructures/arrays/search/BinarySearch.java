package com.datastructures.arrays.search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 9, 10, 13, 15, 17, 18, 19, 23, 36, 37, 41, 45, 47, 56, 89, 99, 121};
        System.out.println(binarySearch(arr, 123));
    }
    static String binarySearch(int[] arr, int target) {
        int start_Index = 0;
        int end_index = arr.length - 1;

        while(start_Index <= end_index) {

//            Line no. 16
//            This is a better way to find middle element of the array
//            This saves the integer values from overflowing if the value of start or end goes past MAX_VALUE of Integer
            int mid = start_Index + (end_index - start_Index)/2;

            if(target > arr[mid]) {
                start_Index = mid + 1;
            }
            else if(target < arr[mid]) {
                end_index = mid - 1;
            }
            else {
                return "Yay! Found element "+target+" at index: "+mid;
            }
        }
        return "Sorry! "+target+" is not present in this array..";
    }
}
