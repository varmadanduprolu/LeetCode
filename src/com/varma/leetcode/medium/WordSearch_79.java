package com.varma.leetcode.medium;

import java.util.Scanner;

public class WordSearch_79 {
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
          visited = new boolean[n][m];
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextLine().charAt(0);
            }
        }
        String word = sc.nextLine();
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] ==word.charAt(0) && wordSearch(i,j,0,board,word))
                    return true;
            }
        }
        return false;
    }

    private static boolean wordSearch(int i, int j, int index, char[][] board, String word) {
          if (index==word.length()){
              return true;
          }
          if (i<0 || i>= board.length || j<0 || j>=board.length || word.charAt(index)!=board[i][j] || visited[i][j])
              return false;
          visited[i][j]=true;
         if(wordSearch(i+1,j,index+1,board,word) ||
            wordSearch(i-1,j,index+1,board,word)||
            wordSearch(i,j+1,index+1,board,word)||
            wordSearch(i,j-1,index+1,board,word))
             return true;
          visited[i][j]=false;
          return false;
    }
}
