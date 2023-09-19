package com.varma.leetcode.medium;

import java.util.Scanner;

public class SearchA2DMatrix_74 {
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

    /**
     * Searches for a target value in a 2D matrix using approach 1.
     *
     * @param matrix  The 2D matrix to be searched.
     * @param target  The target value to be searched for.
     * @return        True if the target value is found, false otherwise.
     */
    private static boolean searchMatrix(long[][] matrix, long target) {

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]) {
                int left=0;
                int right= matrix[i].length-1;
                 while(left<=right){
                     int mid=(left+right)/2;
                     if (matrix[i][mid]==target) return true;
                     else if (matrix[i][mid]>target) right=mid-1;
                     else left=mid+1;
                 }
                return false;
            }
        }
        return false;
    }

    /***
     * Searches for a target value in a 2D matrix using approach 2.
     *
     * @param matrix  The 2D matrix to be searched.
     * @param target  The target value to be searched for.
     * @return        True if the target value is found, false otherwise.
     */
    private static boolean searchMatrix1(long[][] matrix, long target) {
        int i=0;
        int j= matrix.length-1;
        while(i< matrix.length && j>=0){
            if (matrix[i][j]==target) return true;
            else if (matrix[i][j]>target) j--;
            else i++;
        }

        return false;
    }

}
