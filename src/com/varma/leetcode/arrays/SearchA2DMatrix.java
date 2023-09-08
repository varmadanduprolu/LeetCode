package com.varma.leetcode.arrays;

import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long target=sc.nextLong();
        long matrix [][] =new long[m][n];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=sc.nextLong();
            }
        }
        System.out.println(searchMatrix(matrix,target));
    }

    private static boolean searchMatrix(long[][] matrix, long target) {

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (target == matrix[i][j]) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
