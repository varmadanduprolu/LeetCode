package com.varma.leetcode.arrays;

import java.util.Scanner;

public class SmallestNumberWhoseProductOfDigitsIsN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(smallestNumberWhoseProductOfDigitsIsN(num));
    }

    private static long smallestNumberWhoseProductOfDigitsIsN(int num) {
        String res="";
        for (int i = 9; i >=2 ; i--) {
           while (num%i==0){
               num/=i;
               res=i+res;
            }
        }
        if (num!=1)
            return -1;
        else
            return Integer.parseInt(res);
    }
}
