package com.datastructures.arrays.leetcodequestions;

import java.util.Arrays;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 */
public class GreatestCandies {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,6};
        int extraCandies = 4;
        List<Boolean> ls = kidsWithCandies(arr, extraCandies);
        System.out.println(ls);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMax(candies);
        Boolean[] arr = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                arr[i] = true;
            }
            else {
                arr[i] = false;
            }
        }
        return Arrays.asList(arr);
    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
