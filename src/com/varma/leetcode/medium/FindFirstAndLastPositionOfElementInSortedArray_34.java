package com.varma.leetcode.medium;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(findFirstAndLastPositionOfElementInSortedArray(nums,target)));
    }

    private static int[] findFirstAndLastPositionOfElementInSortedArray(int[] nums, int target) {
        // to find the first index
        int start=0;
        int end= nums.length-1;
        int first=-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }else
                end=mid-1;
        }
        //to find the last index
         start=0;
         end= nums.length-1;
         int last=-1;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if (nums[mid]<target){
                start=mid+1;
            }else
                end=mid-1;
        }
        return new int[]{first,last};
    }
}
