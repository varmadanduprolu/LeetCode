package com.varma.leetcode.medium;

import java.util.Scanner;

public class SpiralMatrixTwo_59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[][] res=spiralMatrixTwo(num);
        for (int i = 0; i < res.length ; i++) {
            for (int j = 0; j <res[i].length ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    /**
     * Generates a spiral matrix of size num x num.
     *
     * @param num  The size of the spiral matrix.
     * @return     The generated spiral matrix.
     */
    private static int[][] spiralMatrixTwo(int num) {
        int[][] matrix=new int[num][num];
        int rmin=0;
        int rmax=num-1;
        int cmin=0;
        int cmax=num-1;
        int count=1;

        while (count<=num*num){
            //top border
            for (int i = cmin; i <=cmax ; i++) {
                matrix[rmin][i]=count;
                count++;
            }
            rmin++;
            //right border
            for (int i = rmin; i <=rmax ; i++) {
                matrix[i][cmax]=count;
                count++;
            }
            cmax--;
            //bottom border
            for (int i = cmax; i >=cmin ; i--) {
                matrix[rmax][i]=count;
                count++;
            }
            rmax--;
            //left border
            for (int i = rmax; i >=rmin ; i--) {
                matrix[i][cmin]=count;
                count++;
            }
            cmin++;
        }

        return matrix;
    }
}
