package com.varma.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateFunction_396 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(rotateFunction(nums));
    }

    private static int rotateFunction(int[] nums) {
        int [] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
               ans[j]=ans[j]+nums[j]*i;
            }
        }
        System.out.println(Arrays.toString(ans));

        return 0;
    }
}
