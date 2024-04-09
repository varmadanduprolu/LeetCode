package com.varma.leetcode.easy;

public class MakeTheStringGreat_1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
    }
    public static String makeGood(String s) {
        if(s.length()==0) return null;
        String str=s.substring(0,1);
        for (int i = 1; i < s.length(); i++) {
            if ( str.length()>0 && Math.abs(s.charAt(i)-str.charAt(str.length()-1))==32 )
                str=str.substring(0,str.length()-1);
            else{
                str=str+s.charAt(i);
            }
        }


        return str;
    }
}
