package com.datastructures.arrays.leetcodequestions;

/**
 * 1920. Build Array from Permutation
 */
public class BuildArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5, 2, 3, 5};
        System.out.println("Before building: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter building: ");
        arr = buildArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

