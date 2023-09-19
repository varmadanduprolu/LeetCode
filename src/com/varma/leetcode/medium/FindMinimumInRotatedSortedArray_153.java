package com.varma.leetcode.medium;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray_153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int nums[] = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMinimumInRotatedSortedArray_153(nums));
    }

    /**
     * Finds the minimum element in a rotated sorted array.
     *
     * @param nums  The rotated sorted array.
     * @return      The minimum element in the array.
     */
    private static int findMinimumInRotatedSortedArray_153(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid;
            else left = mid + 1;
        }
        return nums[right];
    }
}