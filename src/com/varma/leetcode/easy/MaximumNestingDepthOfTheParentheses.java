package com.varma.leetcode.easy;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public static int maxDepth(String s) {
        int max=0, count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='(') count++;
            else if (ch==')') count--;
            max=Math.max(max,count);
        }
        return max;
    }
}
