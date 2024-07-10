package com.varma.leetcode.medium;

public class UniquePathsII_63 {
    public static void main(String[] args) {
        int[][] arr= new
                int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(uniquePathsWithObstacles(arr));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int n=obstacleGrid.length, m=obstacleGrid[0].length;
            int dp[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(obstacleGrid[i][j]==1 && i==0 && j==0) return 0;
                if(dp[i][j]<0){
                    dp[i][j]=0;
                    continue;
                }
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    if(i==0){
                        int k=j+1;
                        while(k<m){
                            dp[i][k]=-1;
                            k++;
                        }
                    }
                    if(j==0){
                        int k=i+1;
                        while(k<n){
                            dp[k][j]=-1;
                            k++;
                        }
                    }
                }
                else{
                    if(i==0 || j==0) dp[i][j]=1;
                    else dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
