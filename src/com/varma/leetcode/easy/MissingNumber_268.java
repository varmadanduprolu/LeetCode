package com.varma.leetcode.easy;

import java.util.Scanner;

public class MissingNumber_268 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []nums=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(missingNumber(nums));
    }
    /**
     * Finds the missing number in an array of consecutive numbers from 0 to n.
     *
     * @param nums  The array of numbers.
     * @return  The missing number.
     */
    private static int missingNumber(int[] nums) {
        int sum=0;
        for (int i:nums) {
            sum+=i;
        }
        int n=nums.length;
        return (n*(n+1))/2-sum;
    }
}
