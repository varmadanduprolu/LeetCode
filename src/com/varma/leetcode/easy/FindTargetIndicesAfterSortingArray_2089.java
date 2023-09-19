package com.varma.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTargetIndicesAfterSortingArray_2089 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        System.out.println(findTargetIndicesAfterSortingArray(nums,target));
    }

    private static List<Integer> findTargetIndicesAfterSortingArray(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int start=0;
        int end= nums.length-1;
        int first=-1;
        // Binary search to find the first occurrence of the target
        while (start<=end){
           int mid=(start+end)/2;
            if (nums[mid]==target){
                first=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else
                end=mid-1;
        }
        // Binary search to find the last occurrence of the target
        start=0;
        end=nums.length-1;
        int last=-1;
        while (start<=end){
           int mid=(start+end)/2;
            if (nums[mid]==target){
                last=mid;
                start=mid+1;
            }else if (nums[mid]<target) start=mid+1;
            else end=mid-1;
        }

        // Check if the target is not found in the array
        if (first == -1 || last == -1) {
            return list;
        }

        // Add the indices of the target occurrences to the list
        for (int i = first; i <= last; i++) {
            list.add(i);
        }
        return list;
    }
}
