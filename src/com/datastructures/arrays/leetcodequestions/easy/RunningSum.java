package com.datastructures.arrays.leetcodequestions.easy;

/**
 * 1480. Running Sum of 1d Array
 */
public class RunningSum {

    public static void main(String[] args) {
        int[]arr={7,6,7,1,2,3,4,7,7,6,6,1,2,3,4,1,2};
        System.out.println("Before sum: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter sum: ");
        arr = runningSum(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] runningSum(int[] nums) {

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sum = sum + nums[i];
        }
        return nums;
    }
}