package com.varma.leetcode.easy;

import java.util.Scanner;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(searchInsertPosition(nums,target));
    }

    /**
     * Searches for the position to insert a target number in a sorted array.
     *
     * @param nums    The sorted array of numbers.
     * @param target  The target number to insert.
     * @return        The position to insert the target number.
     */
    private static int searchInsertPosition(int[] nums,int target) {
        int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (target==nums[mid])
                return mid;
            else if (target>nums[mid]) low=mid+1;
            else high=mid-1;

        }
        return high+1;
    }
}

