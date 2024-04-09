package com.varma.leetcode.easy;

import java.util.Scanner;

public class AddBinary_67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bin1=sc.nextLine();
        String bin2=sc.nextLine();
        System.out.println(addBinary(bin1,bin2));
    }

    private static String addBinary(String bin1, String bin2) {
        char[] b1=bin1.toCharArray();
        char[] b2=bin2.toCharArray();
        StringBuilder sb=new StringBuilder("");
        int i=bin1.length()-1;
        int j=bin2.length()-1;
        int carry=0;
        while (i>=0 || j>=0){
            int sum=carry;
            if (i>=0){
                sum+= b1[i]-'0';
                i--;
            }
            if (j>=0){
                sum+= b2[i]-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        if (carry>0) sb.append(carry);
        return sb.reverse().toString();
    }
}
