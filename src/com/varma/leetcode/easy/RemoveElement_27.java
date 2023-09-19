package com.varma.leetcode.easy;

import java.util.Scanner;

public class RemoveElement_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int key=sc.nextInt();
        int [] nums=new int[len];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(removeElement(nums,key));
    }

    private static int removeElement(int[] nums, int key) {
         // Initialize a variable 'res' to keep track of the resulting length of the modified array
        int res = 0;
        // Iterate over each element 'i' in the 'nums' array
        for (int i : nums) {
            // Check if the current element 'i' is not equal to the given 'key'
            if (key != i) {
                // Assign the current element 'i' to the 'res'-th position in the 'nums' array
                nums[res] = i;
                // Increment 'res' to keep track of the next position in the modified array
                res++;
            }
        }
        // Return the resulting length of the modified array
        return res;
    }
}
