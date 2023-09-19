package com.varma.leetcode.easy;

import java.util.Scanner;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(palindromeNumber(num));
    }

    /**
     * Checks if a number is a palindrome.
     *
     * @param num  The number to check.
     * @return     True if the number is a palindrome, false otherwise.
     */
    private static boolean palindromeNumber(int num) {
        int res=0;
        int num1=num;
        while(num>0){
            int rem=num%10;
            num=num/10;
            res=res*10+rem;
        }
        System.out.println(num+" "+res+" "+num1);
        if (res==num1) return true;
        return false;
    }
}
