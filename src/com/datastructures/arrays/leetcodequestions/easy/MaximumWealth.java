package com.datastructures.arrays.leetcodequestions.easy;
/**
 * Leetcode problem number 1672
 * Tag - Array, Easy
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 12},
                {3, 67}
        };
        System.out.println(findMaxWealth(arr));
    }
    static int findMaxWealth(int[][] arr) {
        int max = 0;
        for (int customer = 0; customer < arr.length; customer++) {
            int sum = 0;
            for (int account = 0; account < arr[customer].length; account++) {
                sum = sum + arr[customer][account];
            }
            if(max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
