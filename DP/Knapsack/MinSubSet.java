package DP.Knapsack;

import java.util.Arrays;

public class MinSubSet {
    public static int SumPossible(int[] arr,int i,int[][] dp,int sum) {
        if (sum == 0) return 1;
        if (i >= arr.length || sum < 0) return 0;
        if(dp[i][sum] != -1) return dp[i][sum];
        int take = SumPossible(arr, i+1, dp, sum-arr[i]);
        int nottake = SumPossible(arr, i+1, dp, sum);
        dp[i][sum] = ( take == 1 || nottake == 1 ) ? 1 : 0;
        return dp[i][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1,6,11,4};
        int sum  = 0;
        for(int i:arr) sum += i;
        int[][] dp = new int[arr.length+1][sum+1];
        for(int i = 0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        for(int i = sum/2;i>=0;i--) {
            if(SumPossible(arr,0,dp,i) == 1){
                System.out.println("Minimum Subset Sum Difference: "+ (sum-2*i));
                break;
            }
        }
        
    }
}
