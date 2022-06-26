package com.datastructures.arrays.search;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of array: ");
//        int length = sc.nextInt();
//        int[] arr = new int[length];
//
//        System.out.print("Input the elements of the array: ");
//        for (int i = 0; i < length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Input the element you wish to find: ");
//        int findItem = sc.nextInt();
//
//        System.out.println(linearSearch(arr, findItem));

        int[][] arr2 = {{12, 7, 28, 56}, {8, 67, 84, 81}, {66, 25}, {19}};
        System.out.println(search2DArray(arr2, 19));
    }

    static String linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return "Yay! " + item + " is present at index: " + i;
            }
        }
        return "Sorry, " + item + " does not exist in this array";
    }

    static String search2DArray(int[][] arr, int item) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == item) {
                    return "Yay! " + item + " is present at row " + row + " column " + col;
                }
            }
        }
        return "Sorry, element does not exist in the array!";
    }
}
