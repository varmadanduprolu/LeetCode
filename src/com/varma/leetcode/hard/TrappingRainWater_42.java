package com.varma.leetcode.hard;

import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater_42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(trappingRainWater(nums));
    }


    /**
     * Calculates the maximum height to the left and right of each element in an array.
     *
     * @param preMax  The array to store the maximum height to the left of each element.
     * @param sufMax  The array to store the maximum height to the right of each element.
     * @param nums    The array of heights.
     */
    private static void maxFunction(int[] preMax, int[] sufMax, int[] nums) {
        int pmax=nums[0];
        int smax=nums[nums.length-1];
        int j= nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (pmax<nums[i])
                pmax=nums[i];
            preMax[i]=pmax;
            if (smax<nums[j])
                smax=nums[j];
            sufMax[j]=smax;
            j--;
        }
    }

    /**
     * Calculates the amount of trapped rainwater in an array of heights.
     *
     * @param nums  The array of heights.
     * @return      The amount of trapped rainwater.
     */
    private static int trappingRainWater(int[] nums) {
        int preMax[]=new int[nums.length];
        int sufMax[]=new int[nums.length];
        maxFunction(preMax,sufMax,nums);
        int amount =0;
        for (int i = 1; i < nums.length-1 ; i++) {
                if (preMax[i-1]>sufMax[i+1]){
                    if (sufMax[i+1]>nums[i])
                        amount +=sufMax[i+1]-nums[i];
                }
                else{
                    if (preMax[i-1]>nums[i])
                        amount +=preMax[i-1]-nums[i];
                }
        }
        return amount;
    }


}
