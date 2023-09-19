package com.varma.leetcode.medium;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target=sc.nextInt();
        int height[]=new int[len];
        for (int i = 0; i < height.length; i++) {
            height[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(findFirstAndLastPositionOfElementInSortedArray(height,target)));
    }

    /**
     * Calculates the maximum area of water that can be trapped between vertical lines.
     *
     * @param height  The array of heights representing the vertical lines.
     * @return        The maximum area of water that can be trapped.
     */
    private static int[] findFirstAndLastPositionOfElementInSortedArray(int[] height, int target) {
        // to find the first index
        int start=0;
        int end= height.length-1;
        int first=-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            if (height[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if (height[mid]<target){
                start=mid+1;
            }else
                end=mid-1;
        }
        //to find the last index
         start=0;
         end= height.length-1;
         int last=-1;
        while (start<=end){
            mid=(start+end)/2;
            if (height[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if (height[mid]<target){
                start=mid+1;
            }else
                end=mid-1;
        }
        return new int[]{first,last};
    }
}
