package com.varma.leetcode.easy;

import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        String[] word1=new String[m];
        for (int i = 0; i < word1.length; i++) {
            word1[i]=sc.next();
        }
        int n=sc.nextInt();
        String[] word2=new String[n];
        for (int i = 0; i < word2.length; i++) {
            word2[i]=sc.next();
        }
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         StringBuilder ans1=new StringBuilder();
         StringBuilder ans2=new StringBuilder();
        for (String i: word1
             ) {
            ans1.append(i);
        }
        for (String i: word2
        ) {
            ans2.append(i);
        }
        if (ans1.toString().equals(ans2.toString())) return true;
        return false;
    }
}
