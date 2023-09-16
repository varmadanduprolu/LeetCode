package com.varma.leetcode.easy;

import java.util.Scanner;

public class SqrtOfNumber_69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(mySqrt1(num));
        //System.out.println(mySqrt(num));
    }

    private static int mySqrt1(int x) {
        int start=0;
        int end=x;
        if (x==0 || x==1) return x;
        while(start<=end){
            int mid=(start+end)/2;
            if (mid==x/mid){
                return mid;
            } else if (mid>x/mid) {
                end=mid-1;
            } else{
                start=mid+1;
            }
        }

        return end;
    }
    public static int mySqrt(int x) {
        int i ;
        if (x==0 || x==1) return x;
        for (i=1; i*i<= x; i++) {
            if (i*i==x){
                return i;
            }

        }

        return i-1;
    }
}
