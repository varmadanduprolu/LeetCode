package com.varma.leetcode.easy;

import java.util.Scanner;

public class BinarySearch_704 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        System.out.println(binarySearch(nums,target));
        System.out.println(binarySearchWithRecursion(nums,target,0,nums.length-1));
    }

    /**
     * Performs binary search on a sorted array to find the index of the target element.
     *
     * @param nums    The sorted array to search in.
     * @param target  The target element to find.
     * @return        The index of the target element if found, otherwise -1.
     */
    private static int binarySearch(int[] nums,int target) {
        int start=0;
        int end= nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else start=mid+1;
        }
        return -1;
    }
    /**
     * Performs binary search on a sorted array to find the index of the target element.
     *
     * @param nums    The sorted array to search in.
     * @param target  The target element to find.
     * @return        The index of the target element if found, otherwise -1.
     */

    private static int binarySearchWithRecursion(int[] nums,int target,int start, int end) {
         if(start>end) return -1;

         int mid=start+(end-start)/2;

         if(nums[mid]==target) return mid;

         else if (nums[mid]<target) return binarySearchWithRecursion(nums, target,mid+1,end);

         else return binarySearchWithRecursion(nums,target,start,mid-1);

    }
}
