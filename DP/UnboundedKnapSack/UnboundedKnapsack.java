package DP.UnboundedKnapSack;

import java.util.*;

public class UnboundedKnapsack {

    public static int solve(int idx, int W, int[] wt, int[] val, int[][] dp) {
        if (idx == wt.length || W == 0) return 0;

        if (dp[idx][W] != -1) return dp[idx][W];

        int take = 0;
        if (wt[idx] <= W) {
            take = val[idx] + solve(idx, W - wt[idx], wt, val, dp); 
        }

        int notTake = solve(idx + 1, W, wt, val, dp);

        return dp[idx][W] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        int[] wt  = {2, 4, 6};
        int[] val = {5, 11, 13};
        int W = 10;
        int n = wt.length;
        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        int ans = solve(0,W, wt, val,dp);
        System.out.println("Unbounded Knapsack Maximum Profit = " + ans);
    }
}
