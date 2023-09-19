package com.varma.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(runningSumOf1dArray(nums)));
    }

    /**
     * Calculates the running sum of a 1D array.
     *
     * @param nums  The input array of numbers.
     * @return      The array of running sums.
     */
    private static int[] runningSumOf1dArray(int[] nums) {
        int sum=0;
        int[] runningSum=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            runningSum[i]=sum;
        }
        return runningSum;
    }
}
