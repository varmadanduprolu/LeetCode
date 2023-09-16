package com.varma.leetcode.easy;

import java.util.Scanner;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {

        while(n%2==0){
            n/=2;
            if (n==1) return true;
        }

        return false;
    }
}
