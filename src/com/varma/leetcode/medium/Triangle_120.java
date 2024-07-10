package com.varma.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle_120 {
    public static void main(String[] args) {
            
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        List<Integer> first= triangle.get(n-1);
        for (int i = n-2; i >=0 ; i--) {
            List<Integer> second= triangle.get(i);
            List<Integer> third=new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                third.add(Math.min(first.get(j),first.get(j+1))+ second.get(j));
            }
            first=third;
        }
        return first.get(0);
    }
}
