package DP.UnboundedKnapSack;

public class MaxWaysCoinChange {
    public static int sol(int[] coins,int amount,int idx,int[][] dp){
         if(amount == 0) return 1;
        if(idx >= coins.length) return 0;
        if(dp[idx][amount] != -1) return dp[idx][amount];
        int take = 0;
        if(coins[idx] <= amount){
            take = sol(coins,amount-coins[idx],idx,dp);
        }
        int notTake = sol(coins,amount,idx+1,dp);
        dp[idx][amount] = take + notTake;
        return dp[idx][amount];

    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 5;
        int[][] dp = new int[coins.length][amount + 1];
        for(int[] arr : dp) java.util.Arrays.fill(arr, -1);
        System.out.println("Maximum Ways to make Change = " + sol(coins, amount, 0, dp));

    }
}


//The Possible Combinations are : 1,1,1,1,1
                                   //1,1,1,2
                                      //1,2,2
                                     //1,1,3
                                      //2,3
//Total Ways = 5

//It is just like KnapSack Problem Count the number of subset with given sum