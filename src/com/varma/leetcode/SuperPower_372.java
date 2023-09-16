package com.varma.leetcode;

import java.util.Scanner;

public class SuperPower_372 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int len=sc.nextInt();
        int nums[]=new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(superPow(x,nums));
    }
    public static int superPow(int x, int[] nums) {
        if (x==1) return 1;
        long pow=0;
        for (int i = 0; i < nums.length; i++) {
            pow=pow*10 + nums[i];
        }
        int res=x;
        return (int) util(x,pow);
    }
    public static int util(int x,long pow){
        if (pow==0) return 1;
        if (pow%2==0){
            return util((x*x),pow/2);
        }
        else return x*util(x,pow-1);
    }
}
