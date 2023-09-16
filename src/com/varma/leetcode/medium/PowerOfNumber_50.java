package com.varma.leetcode.medium;

import java.util.Scanner;

public class PowerOfNumber_50 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
       if(n<0) return  util(1/x, Math.abs((long)n));
       else return util(x, n);
    }
    public static double util(double x, long n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return util(x * x, n / 2);
        } else return x * util(x, n - 1);
    }
}
