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
        //starting index
        int start=0;
        int end= nums.length-1;
        int first=0;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target){
                first=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else
                end=mid-1;
        }
        start=0;
        end=nums.length-1;
        int last=0;
        while (start<=end){
            mid=(start+end)/2;
            if (nums[mid]==target){
                last=mid;
                start=mid+1;
            }else if (nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        if (first ==0 && last == 0 && nums.length==1) {
           if(target!=nums[0]) return list;
            list.add(0);
            return list;
        }
        if (first ==0 && last == 0 && nums[0]==target){
            list.add(0);
            return list;
        }
        if(first ==0 && last == 0) return list;
        for (int i = first; i <=last ; i++) {
              list.add(i);
        }
        return list;
    }
}
