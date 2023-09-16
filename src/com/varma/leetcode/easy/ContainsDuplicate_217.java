package com.varma.leetcode.easy;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));

    }

    public static void insertionSort(int[] nums){
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }


    private static boolean containsDuplicate(int[] nums) {
//        insertionSort(nums);
//        int j=0;
//        for (int i = 1; i <nums.length ; i++) {
//            if (nums[j]==nums[i]){
//                return true;
//            }
//            j++;
//        }
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int i: nums) {
            if (!hashSet.add(i))
                return true;
        }

        return false;
    }
}
