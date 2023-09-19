package com.varma.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix_54 {
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
        System.out.println(spiralMatrix(matrix));
    }
    /**
     * Traverses a matrix in a spiral order and returns the elements in a list.
     *
     * @param matrix  The matrix to be traversed.
     * @return        A list containing the elements in spiral order.
     */
    private static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m= matrix.length;
        int n=matrix[0].length;
        int rmin=0;
        int rmax= matrix.length-1;
        int cmin=0;
        int cmax=matrix[0].length-1;
        int count=0;
        while (count<n*m){

            //top border
            for (int i = cmin; i <=cmax && count<m*n; i++) { //1 2 3
               list.add(matrix[rmin][i]);
                count++;
            }
            rmin++;
            //right  border
            for (int i = rmin; i <=rmax && count<m*n; i++) {
                list.add(matrix[i][cmax]);
                count++;
            }
            cmax--;
            //bottom border
            for (int i = cmax; i >=cmin && count<m*n; i--) {
              list.add(matrix[rmax][i]);
                count++;
            }
            rmax--;
            //left border
            for (int i = rmax; i >=rmin && count<m*n; i--) {
                list.add(matrix[i][cmin]);
                count++;
            }
            cmin++;
        }
        return list;
    }
}
