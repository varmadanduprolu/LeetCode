package com.varma.leetcode.easy;

import java.util.Scanner;

public class FibonacciNumber_509 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fibonacciNumber(num));
    }

    private static int fibonacciNumber(int num) {
        if (num<2) return  num;
        int first=0;
        int second=1;
        for (int i = 2; i <=num; i++) {
            int sum=first+second;
            first=second;
            second=sum;
        }
        return second;


    }
}
