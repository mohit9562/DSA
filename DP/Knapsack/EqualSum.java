package DP.Knapsack;
import java.util.*;
public class EqualSum {
    public static boolean equalsum(int[] arr,int i,int sum,int[][] dp) {
        if(i>=arr.length || sum < 0) {
            return false;
        }
        if(sum == 0) {
            return true;
        }
        if(dp[i][sum] != -1) {
            return dp[i][sum] == 1 ? true : false;
        }
        boolean take = equalsum(arr, i+1, sum-arr[i], dp);
        boolean nottake = equalsum(arr, i+1, sum, dp); 
        dp[i][sum] = ( take || nottake ) ? 1 : 0;
        return dp[i][sum] == 1;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        if(sum % 2 != 0) {
            System.out.println(false);
            return;
        }
        int[][] dp = new int[arr.length + 1][(sum / 2) + 1];
        for(int i = 0; i < dp.length; i++) Arrays.fill(dp[i], -1);
        System.out.println(equalsum(arr,0,sum/2,dp));
    }
}
