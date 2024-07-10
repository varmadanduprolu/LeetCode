package com.varma.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeLinkedList_234 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(palindromeList(arr));
        System.out.println(palindromeListNormal(arr));
    }

    static boolean palindromeList(ArrayList<Integer> list){
        if(list.size()>=2 && list.get(0)!= list.get(list.size()-1)){
            return false;
        }
        else if (list.size()==1 || list.size()==0){
            return true;
        }
        if (list.size()>1) {
            list.remove(0);
            list.remove(list.size() - 1);
        }
        return palindromeList(list);
    }

    static boolean palindromeListNormal(ArrayList<Integer> list){
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i)!= list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}
