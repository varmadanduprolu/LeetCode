package com.varma.leetcode.medium;

import java.util.Scanner;

public class PowerOfNumber_50 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(myPow(x,n));
    }

    /**
     * Calculates the power of a number using the exponentiation by squaring algorithm.
     *
     * @param x  The base number.
     * @param n  The exponent.
     * @return   The result of x raised to the power of n.
     */
    public static double myPow(double x, int n) {
       if(n<0) return  power(1/x, Math.abs((long)n));
       else return power(x, n);
    }

    /**
     * Calculates the power of a number using the exponentiation by squaring algorithm.
     *
     * @param x  The base number.
     * @param n  The exponent.
     * @return   The result of x raised to the power of n.
     */
    public static double power(double x, long n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return power(x * x, n / 2);
        } else return x * power(x, n - 1);
    }
}
