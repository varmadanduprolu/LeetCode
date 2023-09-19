package com.varma.leetcode.easy;

import java.util.Scanner;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(climbingStairs(n));
    }

    /**
     * Calculates the number of distinct ways to climb n stairs.
     *
     * @param n  The number of stairs to climb.
     * @return   The number of distinct ways to climb the stairs.
     */
    private static int climbingStairs(int n) {
        /*** it's following the Fibonnaci series
         n=0  output=0
         n=1  output=1  single step
         n=2  output=2   2 single steps , 1 two steps
         n=3  output=3   3 single steps, 1 two step & single step , single step & 1 two step
         ***/
        if (n>=1 && n<3) return n;
        int first=1;
        int second=2;
        for (int i = 3; i <=n; i++) {
            int sum=first+second;
            first=second;
            second=sum;
        }
        return second;
    }
}
