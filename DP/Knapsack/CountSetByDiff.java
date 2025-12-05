package DP.Knapsack;
import java.util.*;
public class CountSetByDiff {
    public static int CountSubSetByDiff(int[] arr,int i,int[][] dp,int sum){
        if(sum == 0) return 1;
        if(i >= arr.length || sum < 0) return 0;
        if(dp[i][sum] != -1) return dp[i][sum];
        int take = CountSubSetByDiff(arr, i+1, dp, sum-arr[i]);
        int nottake = CountSubSetByDiff(arr, i+1, dp, sum);
        return dp[i][sum] = take + nottake;
    }
    public static void main(String[] args) {
        int[] arr = {3,3};
        int diff = 1;
        int totalSum = 0;
        for(int val : arr) totalSum += val;
        if ((totalSum + diff) % 2 != 0) {
            System.out.println(0);       // No valid subset sum possible
            return;
        }
        int[][] dp = new int[arr.length][totalSum+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        System.out.println(CountSubSetByDiff(arr, 0, dp, (totalSum+diff)/2));
    }
}

// a - b = diff 
// a + b = totalSum
// 2a = diff + totalSum
// a = (diff + totalSum)/2
// so we have to find count of subset with sum = (diff + totalSum)/2
