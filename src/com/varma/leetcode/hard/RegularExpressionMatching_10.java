package com.varma.leetcode.hard;

import java.util.Scanner;

public class RegularExpressionMatching_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.next();
        System.out.println(isMatch(s,p));
    }
   // not yet completed
    public static boolean isMatch(String s, String p) {
        int count = 0;
        if (s.length()>=p.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == p.charAt(i)) {
                    count++;
                } else if (p.charAt(i) == '.') {
                    count++;
                } else {
                    return p.charAt(i) == '*';
                }
            }
        }
        return count == s.length();
    }
}
