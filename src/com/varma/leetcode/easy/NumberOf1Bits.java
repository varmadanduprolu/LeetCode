package com.varma.leetcode.easy;

import java.util.Scanner;

public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(numberOf1Bits(str));
    }

    private static int numberOf1Bits(String A) {
        int ans=0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)=='1') ans++;
        }
        return ans;
    }
}
