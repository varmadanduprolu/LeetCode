package com.varma.leetcode.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_Two_Numbers_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        System.out.println(addTwoNumbers(0,list1,list2));
    }

    static ArrayList<Integer> addTwoNumbers(int carry,ArrayList<Integer> list1, ArrayList<Integer> list2){
        if (list1.isEmpty() && list2.isEmpty()){
            ArrayList<Integer> ans= new ArrayList<>();
            if (carry!=0)
               ans.add(carry);
            return ans;
        }
        int p=0;
        ArrayList<Integer> ans= new ArrayList<>();
        if(!list1.isEmpty() && !list2.isEmpty()) {
             p = list1.get(0) + list2.get(0) + carry;
            list1.remove(0);
            list2.remove(0);
        } else if (!list1.isEmpty() ) {
            p = list1.get(0) +carry;
            list1.remove(0);
        }
        else{
            p= list2.get(0) + carry;
            list2.remove(0);
        }
        carry=0;
        if(p>9){
            carry=p/10;
            p=p%10;
        }
        ans.add(p);
        ans.addAll(addTwoNumbers(carry,list1,list2));
        return ans;
    }
}
