package DP.UnboundedKnapSack;

import java.util.Arrays;

public class MinNumberOfCoins {
    public static int sol(int[] coins,int amount,int idx,int[][] dp){

    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        int[][] dp = new int[coins.length][amount + 1];
        for(int[]row:dp) Arrays.fill(dp, -1);
        System.out.println(sol(coins, amount,0,dp));
    }
}
