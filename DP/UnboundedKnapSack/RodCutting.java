package DP.UnboundedKnapSack;

 import java.util.*;

public class RodCutting {

    public static int sol(int[] price, int length, int idx, int[][] dp) {
        if (idx >= price.length || length <= 0) return 0;
        if (dp[idx][length] != -1) return dp[idx][length];

        int take = 0;
        if (idx + 1 <= length) {
            take = price[idx] + sol(price, length - (idx + 1), idx, dp);
        }

        int notTake = sol(price, length, idx + 1, dp);
        dp[idx][length] = Math.max(take, notTake);
        return dp[idx][length];
    }

    
    public static void main(String[] args) {
        int[] price = {2, 5, 7, 8};
        int length = price.length;
        int[][] dp = new int[length][length + 1];
        for (int[] arr : dp) Arrays.fill(arr, -1);
        int result = sol(price, length, 0, dp);
        System.out.println("Rod Cutting Maximum Profit = " + result);
    }
}

