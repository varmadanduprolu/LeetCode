package com.varma.leetcode.medium;

import java.util.Scanner;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target= sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(searchInRotatedSortedArray_33(nums,target));
    }
    /**
     * Searches for a target value in a rotated and sorted array using a modified binary search algorithm.
     *
     * @param nums    The rotated and sorted array.
     * @param target  The target value to be searched for.
     * @return        The index of the target value if found, -1 otherwise.
     */
    private static int searchInRotatedSortedArray_33(int[] nums, int target) {
       int min= findMinimumInRotatedSortedArray(nums);
       if (target==nums[min]){
           return min;
       } else if (target>nums[nums.length-1]) {
              return binarySearch(nums,target,0,min-1);
           }
       else {
           return binarySearch(nums,target, min, nums.length-1);
       }
    }
    /**
     * Finds the index of the minimum element in a rotated and sorted array.
     *
     * @param nums  The rotated and sorted array.
     * @return      The index of the minimum element.
     */
    private static int findMinimumInRotatedSortedArray(int[] nums) {
        int left=0;
        int right= nums.length-1;
        int mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if (nums[mid]<nums[right])
                right=mid;
            else left=mid+1;
        }
        return right;
    }
    /**
     * Performs binary search in a sorted array to find a target value.
     *
     * @param nums    The sorted array.
     * @param target  The target value to be searched for.
     * @param left    The left index of the search range.
     * @param right   The right index of the search range.
     * @return        The index of the target value if found, -1 otherwise.
     */
    public static int binarySearch(int nums[],int target, int left,int right) {
        int mid=0;
        while(left<=right) {
            mid = (left + right) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
