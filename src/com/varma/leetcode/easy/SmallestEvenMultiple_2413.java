package com.varma.leetcode.easy;

import java.util.Scanner;

public class SmallestEvenMultiple_2413 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            return n*2;
        }
    }
}
