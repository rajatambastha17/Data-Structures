package com.datastructures.arrays.leetcodequestions.easy;

/**
 * 1480. Running Sum of 1d Array
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sum = sum + nums[i];
        }
        return nums;
    }
}