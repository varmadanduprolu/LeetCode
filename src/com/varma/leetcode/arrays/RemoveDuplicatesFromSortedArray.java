package com.varma.leetcode.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int len=sc.nextInt();
        int nums[] = new int[len];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }

        }
        return j+1;
    }

    private static int[] removeDuplicatesFromArray(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return nums;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[n - 1];
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }
}
