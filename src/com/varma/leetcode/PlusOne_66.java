package com.varma.leetcode;

import java.util.Arrays;
import java.util.Scanner;



public class PlusOne_66 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        plusOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] plusOne(int[] nums) {
        int res=0;
        for (int i:nums
             ) {
            res=res*10+i;
        }
        res+=1;

        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            int element=res%10;
            nums[i]=element;
            res/=10;
        }

        return nums;
       // System.out.println(Arrays.toString(nums));

    }

    public static class Permutations_46 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int len=sc.nextInt();
            int nums[]=new int[len];
            for (int i = 0; i < nums.length; i++) {
                nums[i]=sc.nextInt();
            }
        }
    }
}
