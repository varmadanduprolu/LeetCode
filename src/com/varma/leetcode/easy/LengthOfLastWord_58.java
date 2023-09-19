package com.varma.leetcode.easy;

import java.util.Scanner;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

    /**
     * Calculates the length of the last word in a given string.
     *
     * @param s  The input string.
     * @return   The length of the last word in the string.
     */
    private static int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        return strings[strings.length-1].length();
    }
}
