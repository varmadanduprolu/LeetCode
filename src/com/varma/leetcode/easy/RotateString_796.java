package com.varma.leetcode.easy;

import java.util.Scanner;

public class RotateString_796 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String goal=sc.next();

        System.out.println(rotateString(s,goal));
    }

    private static boolean rotateString(String s, String goal) {
        StringBuilder res= new StringBuilder(s);
        int n=s.length();
        while(n>0){
            if (res.toString().equals(goal)){
                return true;
            }
            char ch= res.charAt(0);
            res.deleteCharAt(0);
            res.append(ch);
            n--;
        }
        return false;
    }
}
