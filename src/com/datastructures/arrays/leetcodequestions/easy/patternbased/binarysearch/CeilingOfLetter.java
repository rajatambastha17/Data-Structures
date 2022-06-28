package com.datastructures.arrays.leetcodequestions.easy.patternbased.binarysearch;

import java.util.Scanner;

public class CeilingOfLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] arr = {'a', 'b', 'd', 'g', 'i', 'k', 't', 'u', 'v', 'w', 'x', 'y' };
        System.out.println("Input a letter: ");
        String str = s.next();
        char input = str.charAt(0);
        char result = ceilingOfLetter(arr, input);
        System.out.println(result);
    }

    public static char ceilingOfLetter(char[] arr, char letter) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letter < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
