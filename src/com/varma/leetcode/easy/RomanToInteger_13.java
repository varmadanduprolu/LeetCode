package com.varma.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String symbol = sc.nextLine().toUpperCase().trim();
        System.out.println(romanToInt(symbol));
    }

    private static int romanToInt(String symbol) {
        Map<Character, Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
       int res=map.get(symbol.charAt(symbol.length()-1));
        for (int i = symbol.length()-2; i >=0; i--) {
           if (map.get(symbol.charAt(i))>= map.get(symbol.charAt(i+1))){
               res+= map.get(symbol.charAt(i));
           } else if (map.get(symbol.charAt(i))< map.get(symbol.charAt(i+1))) {
               res-= map.get(symbol.charAt(i));
           }
        }
        return Math.abs(res);
    }
}
