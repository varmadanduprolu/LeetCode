package com.varma.leetcode.arrays;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        return strings[strings.length-1].length();
    }
}
