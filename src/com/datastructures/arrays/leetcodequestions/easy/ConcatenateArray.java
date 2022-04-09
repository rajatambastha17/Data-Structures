package com.datastructures.arrays.leetcodequestions.easy;

/**
 * 1929. Concatenation of Array
 */
public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
