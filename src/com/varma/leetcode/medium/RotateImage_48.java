package com.varma.leetcode.medium;

import java.util.Scanner;

public class RotateImage_48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
              matrix[i][j]=sc.nextInt();
            }
        }
        rotationOfMatrixBy90Degrees(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    /**
     * Rotates a matrix by 90 degrees clockwise.
     *
     * @param matrix  The matrix to be rotated.
     */
    private static void rotationOfMatrixBy90Degrees(int[][] matrix) {
        //matrix converts to matrix T
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
        int left=0;
        int right= matrix.length-1;
        //swapping the column
        while (left<right){
            for (int i = 0; i < matrix.length; i++) {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }

    }
}
