package com.varma.leetcode.easy;

import java.util.Scanner;

public class ThreeDivisors_1952 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(threeDivisors(num));
    }

    private static boolean threeDivisors(int num) {
        int count=2 ;
        for (int i = 2; i*i <=num ; i++) {
            if (num%i==0 && num/i==i){
                count++;
            }
            else if(num%i==0 && num%(num/i)==0) {
                count+=2;
            } else if (num%i==0) {
                count++;
            }
        }
        System.out.println(count);
        if (count==3) return true;

        return false;
    }
}
