package DP.Knapsack;
// Selecting Stocks

// Problem Statement:
// An investor has saved some money (savings) and wants to invest in the stock market. There are N stocks to choose from. Their current prices are given in the array current, and their predicted prices after 1 year are given in the array future.

// The investor can buy at most one share of each stock. The total investment must not exceed the available savings.

// Your task is to determine the maximum profit that can be earned after 1 year.

// Profit for a stock = future[i] - current[i]

// Input Format:
// The first line contains an integer T, the number of test cases.

// For each test case:
// - The first line contains two integers N and savings.
// - The second line contains N space-separated integers representing the current prices.
// - The third line contains N space-separated integers representing the future prices.

// Output Format:
// For each test case, print the maximum profit on a new line.

// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ N ≤ 100
// 1 ≤ savings ≤ 30000
// 1 ≤ current[i] ≤ 300
// 1 ≤ future[i] ≤ 300
// The sum of N over all test cases does not exceed 100.

// Sample Input 1:
// 1
// 5 250
// 175 133 109 210 97
// 200 125 128 228 133

// Sample Output 1:
// 55

// Explanation:
// Savings = 250
// Current = [175, 133, 109, 210, 97]
// Future =  [200, 125, 128, 228, 133]

// Choose stocks at indices 2 and 4:
// Investment = 109 + 97 = 206
// Future value = 128 + 133 = 261
// Profit = 261 - 206 = 55

// Sample Input 2:
// 1
// 4 30
// 1 2 4 6
// 5 3 5 6

// Sample Output 2:
// 6

// Explanation:
// Choose stocks with maximum profit within savings limit.

// Note:
// This is a 0/1 Knapsack problem where:
// - Weight = current[i]
// - Value = future[i] - current[i]

import java.util.*;
public class StockPrice{
     public static int sol(int[] arr1, int[] arr2, int idx, int m, int[][] dp) {
        if (idx == arr1.length) return 0;
        if (dp[idx][m] != -1) return dp[idx][m];
        int nottake = sol(arr1, arr2, idx + 1, m, dp);
        int take = 0;
        if (m >= arr1[idx]) {
            take = (arr2[idx] - arr1[idx]) +
                   sol(arr1, arr2, idx + 1, m - arr1[idx], dp);
        }
        return dp[idx][m] = Math.max(take, nottake);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (test-- > 0) {
            int size = in.nextInt();
            int m = in.nextInt();
            int[][] dp = new int[size][m + 1];
            for (int[] arr : dp) Arrays.fill(arr, -1);
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            for (int i = 0; i < size; i++) arr1[i] = in.nextInt();
            for (int i = 0; i < size; i++) arr2[i] = in.nextInt();
            sb.append(sol(arr1, arr2, 0, m, dp)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
   