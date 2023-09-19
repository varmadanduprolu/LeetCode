package com.varma.leetcode.easy;

import java.util.Scanner;

public class SignOfTheProductOfAnArray_1822 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(arraySign(nums));
    }

    /**
     * Determines the sign of the product of an array of numbers.
     *
     * @param nums  The array of numbers.
     * @return  The sign of the product: 1 for positive, -1 for negative, or 0 if the array contains a zero.
     */
    private static int arraySign(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i]==0)
               return 0;
           else if (nums[i]<0)
               res++;
        }
     return (res%2==0)?1:-1;

    }
}
