package DP.Knapsack;

import java.util.*;

public class TargetSum {

    public static int countSubsets(int[] arr, int i, int sum, int[][] dp) {
        if (sum == 0) return 1;                // valid subset found
        if (i >= arr.length || sum < 0) return 0;

        if (dp[i][sum] != -1)
            return dp[i][sum];

        int take = countSubsets(arr, i + 1, sum - arr[i], dp);
        int nottake = countSubsets(arr, i + 1, sum, dp);

        return dp[i][sum] = take + nottake;
    }

    public static int findTargetSumWays(int[] arr, int target) {

        int totalSum = 0;
        for (int x : arr) totalSum += x;

        // Condition: (totalSum + target) must be even & non-negative
        if ((totalSum + target) % 2 != 0) return 0;
        if (Math.abs(target) > totalSum) return 0;

        int requiredSum = (totalSum + target) / 2;

        int[][] dp = new int[arr.length][requiredSum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return countSubsets(arr, 0, requiredSum, dp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int target = 1;

        System.out.println(findTargetSumWays(arr, target)); 
    }
}



// a - b = diff 
// a + b = totalSum
// 2a = diff + totalSum
// a = (diff + totalSum)/2
// so we have to find count of subset with sum = (diff + totalSum)/2

//Target Sum problem is same as Count of Subset with Given Sum problem
