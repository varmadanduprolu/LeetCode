package com.varma.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateArray_189 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int k=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        rotateArray1(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int[] nums,int k) {
        k=k% nums.length;
        List<Integer> list=new ArrayList<>();
        for (int i:nums
             ) {
           list.add(i);
        }
        while(k>0){
            int last=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,last);
            k--;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]= list.get(i);
        }

    }

    /**
     * Rotates an array to the right by k steps.
     *
     * @param nums  The array to be rotated.
     * @param k     The number of steps to rotate the array.
     */
    private static void rotateArray1(int[] nums, int k) {
        // Calculate the effective number of steps by taking the modulus of k with the length of the array
        k = k % nums.length;

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements starting from index k
        reverse(nums, k, nums.length - 1);
    }
    /**
     * Reverses the elements in a subarray of an array.
     *
     * @param nums   The array containing the subarray.
     * @param left   The starting index of the subarray.
     * @param right  The ending index of the subarray.
     */
    private static void reverse(int[] nums, int left, int right) {
        // Reverse the elements in the subarray from index 'left' to index 'right'

        while (left < right) {
            // Swap the elements at indices 'left' and 'right'
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move the left pointer to the right and the right pointer to the left
            left++;
            right--;
        }
    }
}
