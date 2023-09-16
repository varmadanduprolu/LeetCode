package com.varma.leetcode.medium;

import java.util.*;

public class MajorityElementsTwo_229 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
       // System.out.println(majorityElementsTwo(nums));
        System.out.println(majorityElementsTwo1(nums));
       // System.out.println(boyerMooresVotingAlgorithm(nums));
    }

    private static List<Integer> majorityElementsTwo(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            int candidate=nums[i];
            int count=1;
            for (int j = i+1; j < nums.length; j++) {
                if (candidate==nums[j])
                    count++;
                else
                    count--;
                if (count==0){
                    candidate=nums[j];
                    count=1;
                }
            }
            count=0;
            for (int k: nums
                 ) {
                if (k==candidate) count++;
            }
            if (count>= nums.length/3) list.add(candidate);
        }
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        for (int i:list
             ) {
            list1.add(i);
        }
        return list1;
    }

    public static List<Integer> majorityElementsTwo1(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums
             ) {
            if (map.containsKey(i)){
              map.put(i,map.get(i)+1);
            }
            else
              map.put(i,1);
        }
        List<Integer> list=new ArrayList<>();
        for (int i:map.keySet()
             ) {
            if (map.get(i)> nums.length/3){
                list.add(i);
            }
        }

        return list;
    }

    public static List<Integer> boyerMooresVotingAlgorithm(int[] nums) {
        //Boyer Moore’s Voting Algorithm
        int nums1 = -1;
        int nums2 = -2;
        int n = nums.length;
        int ct1 = 0;
        int ct2 = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] == nums1) ct1++;
            else if (nums[i] == nums2) ct2++;

            else if (ct1 == 0) {
                nums1 = nums[i];
                ct1 = 1;
            } else if (ct2 == 0) {
                nums2 = nums[i];
                ct2 = 1;
            } else {
                ct1--;
                ct2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        ct1 = 0;
        ct2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums1) {
                ct1++;
            }
            if (nums[i] == nums2) {
                ct2++;
            }
        }
        if (ct1 > n / 3) ans.add(nums1);
        if (ct2 > n / 3) ans.add(nums2);
        return ans;
    }
}


