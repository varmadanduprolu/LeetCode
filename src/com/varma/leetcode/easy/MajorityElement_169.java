package com.varma.leetcode.easy;

import java.util.Scanner;

public class MajorityElement_169 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int num[]=new int[len];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        System.out.println(majorityElement(num));

    }

    /**
     * Finds the majority element in an array, if it exists.
     *
     * @param num  The array of numbers.
     * @return     The majority element if it exists, otherwise -1.
     */
    private static int majorityElement(int[] num) {
        int candidate=num[0];
        int count=1;
        for (int i = 1; i < num.length; i++) {
            if (num[i]==candidate)
                count++;
            else
                count--;

            if (count==0) {
                candidate = num[i];
                count = 1;
            }
        }
         count=0;
        for (int i:num
             ) {
            if (i==candidate)
                count++;
        }
        if (count > num.length/2)
              return candidate;
        else
            return -1;
    }

}
