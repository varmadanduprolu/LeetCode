package com.varma.leetcode.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int key=sc.nextInt();
        int [] nums=new int[len];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(removeElement(nums,key));
    }

    private static int removeElement(int[] nums, int key) {
        int res=0;
        for (int i:nums) {
            if(key!=i){
                nums[res]=i;
                res++;
            }
        }
        return res;
    }
}
