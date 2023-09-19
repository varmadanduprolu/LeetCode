package com.varma.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber_136 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(singleNumber(nums));
    }

    /**
     * Finds the single number in an array where all other numbers appear twice.
     *
     * @param nums  The array of numbers.
     * @return      The single number.
     */
    private static int singleNumber(int[] nums) {
        int x=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums) {
            if (map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
               map.put(i,1);
        }
        for(Map.Entry<Integer,Integer> i: map.entrySet()) {
            if(i.getValue() == 1) {
                x=i.getKey();
                break;
            }
        }
           return x;
    }
}
