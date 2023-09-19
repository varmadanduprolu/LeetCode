package com.varma.leetcode.medium;

import java.util.*;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int height[]=new int[len];
        for (int i = 0; i < height.length; i++) {
            height[i]=sc.nextInt();
        }
        System.out.println(maxArea(height));
    }

    /**
     * Calculates the maximum area of water that can be trapped between vertical lines.
     *
     * @param height  The array of heights representing the vertical lines.
     * @return The maximum area of water that can be trapped.
     */
    private static int maxArea(int[] height) {
       int left=0;
        int right= height.length-1;
        int max=0;
        while (left<right){
            int temp=0;
            if (height[left]<=height[right]){
                temp=height[left]*(right-left);
                left++;
            }
            else {
                temp = height[right] * (right - left);
                right--;
            }
            if (max<temp)
                max=temp;
        }
        return max;
    }
}
