package com.varma.leetcode.easy;

import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack=sc.nextLine();
        String needle= sc.nextLine();

        System.out.println(strStr(haystack,needle));
    }

    private static int strStr(String haystack, String needle) {
        if(haystack.length()>=needle.length()) {
            int index=0;
            int i=0;
            int j=0;
              while ( j<needle.length() && i<haystack.length()){
                if (haystack.charAt(i)==needle.charAt(j) ){
                    if (j==0){
                        index=i;
                    }
                    j++;
                }
                  i++;
            }
            if (haystack.substring(index,index+needle.length()).equals(needle)) return index;
        }
      return -1;
    }
}
