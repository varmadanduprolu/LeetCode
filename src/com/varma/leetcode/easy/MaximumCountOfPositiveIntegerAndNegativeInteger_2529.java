package com.varma.leetcode.easy;

import java.util.Scanner;

public class MaximumCountOfPositiveIntegerAndNegativeInteger_2529 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(maximumCountOfPositiveIntegerAndNegativeInteger(nums));
    }

    private static int maximumCountOfPositiveIntegerAndNegativeInteger(int[] nums) {
        int count=0;
        int zeros=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
               zeros++;
            }
            else if (nums[i]<0){
                count++;
            }
        }
        if (nums.length-count-zeros>count) return nums.length-count-zeros;
        else return count;
    }
}
