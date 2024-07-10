package com.varma.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MazeAllPaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        boolean[][] board= new boolean[r][c];
        int[][] path= new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                board[i][j]=sc.nextBoolean();
            }
        }
      //  mazeWithRestrications("",board,0,0);
      //  System.out.println(mazeWithRestricationsWithRet("",board,0,0));
      //  System.out.println(mazeWithAllPaths("",board,0,0));
        mazeWithAllPathsSteps("",board,0,0,path,1);
    }

    private static void mazeWithRestrications(String p, boolean[][] board, int r, int c) {
        if (r== board.length-1 && c== board[0].length-1){
            System.out.println(p);
            return;
        }
        if (!board[r][c]){
            return;
        }
        if (r< board.length-1){
            mazeWithRestrications(p+'V',board, r+1,c);
        }
        if (c< board[0].length-1 ){
            mazeWithRestrications(p+'H',board, r,c+1);
        }
    }
    private static ArrayList<String> mazeWithRestricationsWithRet(String p, boolean[][] board, int r, int c) {
        if (r== board.length-1 && c== board[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();
        if (!board[r][c]){
            return list;
        }
        if (r< board.length-1){
            list.addAll(mazeWithRestricationsWithRet(p+'V',board, r+1,c));
        }
        if (c< board[0].length-1 ){
            list.addAll(mazeWithRestricationsWithRet(p+'H',board, r,c+1));
        }
        return list;
    }


    private static ArrayList<String> mazeWithAllPaths(String p, boolean[][] board, int r, int c) {
        if (r== board.length-1 && c== board[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();
        if (!board[r][c]){
            return list;
        }
        board[r][c]=false;
        if (r< board.length-1){
            list.addAll(mazeWithAllPaths(p+'D',board, r+1,c));
        }
        if (r> 0){
            list.addAll(mazeWithAllPaths(p+'U',board, r-1,c));
        }
        if (c> 0){
            list.addAll(mazeWithAllPaths(p+'L',board, r,c-1));
        }
        if (c< board[0].length-1 ){
            list.addAll(mazeWithAllPaths(p+'R',board, r,c+1));
        }
        board[r][c]=true;
        return list;
    }

    private static void mazeWithAllPathsSteps(String p, boolean[][] board, int r, int c,int[][] path, int step) {
        if (r== board.length-1 && c== board[0].length-1){
            path[r][c]=step;
            for (int[] arr:path
                 ) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!board[r][c]){
            return;
        }
        board[r][c]=false;
        path[r][c]=step;

        if (r< board.length-1){
            mazeWithAllPathsSteps(p+'D',board, r+1,c,path, step+1);
        }
        if (c< board[0].length-1 ){
            mazeWithAllPathsSteps(p+'R',board, r,c+1,path, step+1);
        }
        if (r> 0){
            mazeWithAllPathsSteps(p+'U',board, r-1,c,path, step+1);
        }
        if (c> 0){
           mazeWithAllPathsSteps(p+'L',board, r,c-1,path, step+1);
        }

        board[r][c]=true;
        path[r][c]=0;
    }
}
