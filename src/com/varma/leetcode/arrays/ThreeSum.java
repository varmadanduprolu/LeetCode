package com.varma.leetcode.arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        //int target=sc.nextInt();
        int nums[] = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(threeSum(nums));
    }

    //two pointer approach
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //fixing the i the element checking all possibilities with
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int tar = -nums[i];
                int j = i + 1;
                int k = nums.length - 1;
                //here taking two pointers j,k
                while (j < k) {
                    if (nums[j] + nums[k] == tar) {
                        if (nums[i] == 0 && nums[j] == 0 && nums[k] == 0){
                        } else {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                            res.add(temp);
                            //System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                        }
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if (nums[j] + nums[k] > tar) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
