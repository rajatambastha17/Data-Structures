package com.datastructures.arrays.leetcodequestions;

/**
 * 1470. Shuffle the Array
 */
public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 5, 2, 3};
        System.out.println("Before shuffle: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter sum: ");
        arr = shuffle(arr, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        return result;
    }
}