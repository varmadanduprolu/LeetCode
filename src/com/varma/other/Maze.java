package com.varma.other;

import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(mazeCount(r,c));
        mazePatern("",r,c);
        System.out.println(mazePaternRet("",r,c));
        System.out.println(mazePaternRetDai("",r,c));
    }

    private static int mazeCount(int r, int c) {
        if (r==1 || c==1){
            return 1;
        }
        int left=mazeCount(r-1,c);
        int right=mazeCount(r,c-1);
        return left+right;
    }

    private static void mazePatern(String p,int r, int c) {
        if (r==1 && c==1){
            System.out.println(p);
        }
       if (r>1){
           mazePatern(p+'D',r-1,c);
       }
       if (c>1){
           mazePatern(p+'R',r,c-1);
       }
    }

    private static ArrayList<String> mazePaternRet(String p, int r, int c) {
        if (r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
           ArrayList<String> list=new ArrayList<>();
        if (r>1){
            list.addAll(mazePaternRet(p+'D',r-1,c));
        }
        if (c>1){
            list.addAll(mazePaternRet(p+'R',r,c-1));
        }


        return list;
    }

    private static ArrayList<String> mazePaternRetDai(String p, int r, int c) {
        if (r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if (r>1){
            list.addAll(mazePaternRetDai(p+'V',r-1,c));
        }
        if (c>1){
            list.addAll(mazePaternRetDai(p+'H',r,c-1));
        }
        if (r>1 && c>1){
            list.addAll(mazePaternRetDai(p+'D',r-1,c-1));
        }

        return list;
    }
}