package com.datastructures.arrays.leetcodequestions.easy.patternbased.binarysearch;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 9, 9, 9, 9, 9, 9, 9, 10};
        int target = 9;
        int[] result = new FirstAndLastElement().searchRange(arr, target);

        System.out.print("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];
        int firstIndex = getIndex(nums, target, true);
        int lastIndex = getIndex(nums, target, false);
        index[0] = firstIndex;
        index[1] = lastIndex;
        return index;
    }

    public int getIndex(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int start_Index = 0;
        int end_index = arr.length - 1;

        while (start_Index <= end_index) {
            int mid = start_Index + (end_index - start_Index) / 2;
            if (target > arr[mid]) {
                start_Index = mid + 1;
            } else if (target < arr[mid]) {
                end_index = mid - 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findFirstIndex) {
                    end_index = mid - 1;
                } else {
                    start_Index = mid + 1;
                }
            }
        }
        return ans;
    }
}
