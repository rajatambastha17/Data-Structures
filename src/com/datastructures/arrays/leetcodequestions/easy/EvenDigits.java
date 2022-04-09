package com.datastructures.arrays.leetcodequestions.easy;

/**
 * 1295. Find Numbers with Even Number of Digits
 */

public class EvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int numberOfDigits = countDigits(num);
            if(numberOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public int countDigits(int num) {
        int count = 0;
        if(num<10) {
            return ++count;
        }
        num = num/10;
        count++;
        return count+countDigits(num);
    }
}