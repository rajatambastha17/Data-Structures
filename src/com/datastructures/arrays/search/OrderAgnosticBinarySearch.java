package com.datastructures.arrays.search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 10, 13, 15, 17, 18, 19, 23, 36, 37, 41, 45, 47, 56, 89, 99, 121};
        int[] arrDesc = {100,99, 65, 56, 55, 54, 49, 40, 34, 33, 32, 29, 21, 20, 19, 18, 17, 16, 15, 10, 7, 2, 1};
        System.out.println(orderAgnosticBinarySearch(arrDesc, 33));
    }
    static String orderAgnosticBinarySearch(int[] arr, int findElement) {
        int start_index = 0;
        int end_index = arr.length - 1;

//        Checking for ascending or descending order sorted array
        boolean isAsc = arr[0] < arr[arr.length-1] ? true : false;
        boolean isDesc = arr[0] > arr[arr.length-1] ? true : false;

        while(start_index <= end_index) {
            int mid = start_index + (end_index-start_index)/2;

            if(arr[mid] == findElement) {
                return findElement+" found on index number: "+mid;
            }
            else {
                if (isAsc) {
                    if (findElement < arr[mid]) {
                        end_index = mid - 1;
                    } else {
                        start_index = mid + 1;
                    }
                } else {
                    if (findElement > arr[mid]) {
                        end_index = mid - 1;
                    } else {
                        start_index = mid + 1;
                    }
                }
            }
        }
        return "Element not found!";
    }
}
