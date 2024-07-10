package com.varma.leetcode.medium;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome1("cbbd"));
    }

    public static String longestPalindrome1(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            int left=0, right=0;
            if (s.length()%2==0){
                 left=i;
                 right=i+1;
            }
            else{
                left=i;
                right=i;
            }
            String ans= checkpalinidrme1(s,left,right);
            if (res.length()< ans.length())
                res=ans;
        }
        return res;
    }
    public static String checkpalinidrme1(String s, int left, int right){
        String ans="";
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            ans=s.substring(left,right+1);
            left--;
            right++;
        }
        return ans;
    }
    public static String longestPalindrome(String s) {
        String ans= s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkpalinidrme(s,i,j)){
                    String str2=s.substring(i,j+1);
                    if(ans.length()<str2.length()) ans=str2;
                }
            }
        }
        return ans;
    }

    private static boolean checkpalinidrme(String s, int i, int j) {
        while(i<j){
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


}
