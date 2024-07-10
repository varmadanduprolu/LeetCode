package com.varma.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] A= new int[n];
        for (int i = 0; i < n; i++) {
            A[i]= sc.nextInt();
        }
        ArrayList<Integer> ans= new ArrayList<>();
        ArrayList<ArrayList<Integer>> set =new ArrayList<>();
       // subSet(A,0,ans);
//        System.out.println("_________________________");
//        ArrayList<ArrayList<Integer>> res= subSetWithRet(ans,A, 0, set);
//        for (ArrayList<Integer> sub: res
//             ) {
//            System.out.println(sub);
//        }

//        System.out.println("______________________");
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> res1= subSetWithRetDuplicate(ans,A, 0, set,A.length);
        for (ArrayList<Integer> sub: res1
             ) {
            System.out.println(sub);
        }
    }

    private static void subSet(int[] A,int idx, ArrayList<Integer> set) {
        if(idx==A.length){
            System.out.println(set);
            return;
        }
        subSet(A,idx+1,set);
        set.add(A[idx]);
        subSet(A,idx+1,set);
        set.remove(set.size()-1);
    }
    private static ArrayList<ArrayList<Integer>>  subSetWithRet(ArrayList<Integer> res, int[] A,int idx, ArrayList<ArrayList<Integer>> set) {
        if(idx==A.length){
           ArrayList<Integer> list= new ArrayList<>(res);
           set.add(list);
            return set;
        }
        subSetWithRet(res,A,idx+1,set);
        res.add(A[idx]);
        subSetWithRet(res,A,idx+1,set);
        res.remove(res.size()-1);
        return set;
    }
    private static ArrayList<ArrayList<Integer>>  subSetWithRetDuplicate(ArrayList<Integer> res, int[] A,int idx, ArrayList<ArrayList<Integer>> set,int n) {
      // if(idx==n) {
           ArrayList<Integer> ans = new ArrayList<>(res);
           set.add(ans);
          // return set;
    //   }
        for (int i = idx; i <n ; i++) {
            if (i > idx && A[i] == A[i - 1]) {
                continue;
            }
            res.add(A[i]);
            subSetWithRetDuplicate(res, A, i + 1, set,n);
            res.remove(res.size() - 1);
        }
        return set;
    }
}
