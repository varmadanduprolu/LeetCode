package com.varma.other;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutatiom {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String A=sc.nextLine();
        permutation("",A);
        System.out.println();
        System.out.println("_____");
        ArrayList<String> ans =new ArrayList<>();
        System.out.println(permutationWithRet("",A));
    }

    private static void permutation(String p,String up) {
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch= up.charAt(0);
        for (int i=0;i<=p.length();i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,  up.substring(1));
        }
    }

    private static ArrayList<String> permutationWithRet(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> ans= new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> left=new ArrayList<>();
        char ch= up.charAt(0);
        for (int i=0;i<=p.length();i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           left.addAll(permutationWithRet(f+ch+s,  up.substring(1)));
        }
        return left;
    }


}
