package com.datastructures.arrays.leetcodequestions.easy;

/**
 * 1929. Concatenation of Array
 */
public class ConcatenateArray {

    public static void main(String[] args) {
        int[] arr = {12, 36, 5, 7, 1, 2, 3};

        System.out.println("Before concatenation: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter concatenation: ");
        arr = getConcatenation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
