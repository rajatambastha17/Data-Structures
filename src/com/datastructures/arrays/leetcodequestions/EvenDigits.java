package com.datastructures.arrays.leetcodequestions;

/**
 * 1295. Find Numbers with Even Number of Digits
 */

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums={1,23,6,7576,2,1,63,665,23};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int numberOfDigits = countDigits(num);
            if(numberOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(int num) {
        int count = 0;
        if(num<10) {
            return ++count;
        }
        num = num/10;
        count++;
        return count+countDigits(num);
    }
}