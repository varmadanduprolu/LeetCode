package com.varma.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FindGreatestCommonDivisorOfArray_1979 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(findGCD(nums));
    }

    private static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int m=nums[0];
        int n=nums[nums.length-1];
        return util(m,n);
    }

    /**
     * Calculates the greatest common divisor (GCD) of two numbers using the Euclidean algorithm.
     *
     * @param m  The first number.
     * @param n  The second number.
     * @return   The greatest common divisor (GCD) of the two numbers.
     */
    private static int util(int m, int n) {

            while (n!=0) {
                int rem=m%n;
                m=n;
                n=rem;
            }
        return m;
    }
}
