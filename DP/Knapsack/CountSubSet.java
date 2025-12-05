package DP.Knapsack;

import java.util.*;

public class CountSubSet {
    public static int countsubset(int[] arr,int sum,int i,int[][] dp) {
              if(sum == 0) return 1;
        if(i >= arr.length || sum < 0) return 0;
        if(dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int take = countsubset(arr, sum-arr[i], i+1, dp);
        int nottake = countsubset(arr, sum, i+1, dp);
        dp[i][sum] = take + nottake;
        return dp[i][sum];
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10};
        int sum = 10;
        int[][] dp = new int[arr.length + 1][sum + 1];
        for(int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
        System.out.println(countsubset(arr,sum,0,dp));
    }
}
