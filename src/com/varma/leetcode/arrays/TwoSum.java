package com.varma.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int target= sc.nextInt();
        int [] nums=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int ele=target-nums[i];
            if(map.containsKey(ele)){
                ans[0]=map.get(ele);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i );
        }
        return ans;
    }
}
