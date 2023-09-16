package com.varma.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberAtLeastTwiceOfOthers_747 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(largestNumberAtLeastTwiceOfOthers1(nums));
    }

    private static int largestNumberAtLeastTwiceOfOthers(int[] nums) {
        int num1[]=new int[nums.length];
        for (int i = 0; i < num1.length; i++) {
            num1[i]=nums[i];
        }
        Arrays.sort(num1);
        int max=num1[num1.length-1];
        int sec_max=num1[num1.length-2];
        if (max>=2*sec_max) {
            for (int i = 0; i < nums.length; i++) {
                 if (nums[i]==max) return i;
            }
        }
        return -1;
    }

    private static int largestNumberAtLeastTwiceOfOthers1(int[] nums) {
        int max=nums[0];
        int sec_max=0;
        int pos=0;
        for (int i = 1; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
                pos=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<max && sec_max<nums[i]){
                sec_max=nums[i];
            }
        }
        if (max>=2*(sec_max)) return pos;
        return -1;
    }
}
