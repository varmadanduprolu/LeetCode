package com.varma.other;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String A=sc.nextLine();
           subsSeq("", A);
       System.out.println(subSeqWithRet("", A));
        ArrayList<String> ans= new ArrayList<>();
        System.out.println(subsSeqBack("", A, ans));
    }
    static void subsSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsSeq(p,up.substring(1));
        subsSeq(p+ch, up.substring(1));

    }

    static ArrayList<String> subSeqWithRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subSeqWithRet(p,up.substring(1));
        ArrayList<String> right=subSeqWithRet(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subsSeqBack(String p, String up, ArrayList<String> set){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
       // set.add(p);
        subsSeqBack(p,up.substring(1),set);
        p+= up.charAt(0);
       set.add(p);
        subsSeqBack(p, up.substring(1),set);
        p.substring(0,p.length()-1);
        return set;
    }
}
