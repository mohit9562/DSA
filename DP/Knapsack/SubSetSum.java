package DP.Knapsack;

import java.util.Scanner;

public class SubSetSum {
    public static boolean SubSetSum(int[] arr,int W,int i){
        if(i < 0){
            return false;
        }
       if(W == 0){
           return true;
       }
       if(arr[i] > W){
        return SubSetSum(arr,W,i-1);
       }else{
        return SubSetSum(arr,W-arr[i],i-1) || SubSetSum(arr,W,i-1);
       }
       
    }
    public static boolean SubSetSumDP(int[] arr,int W){
        boolean[][] dp = new boolean[arr.length+1][W+1];
        for(int i=0;i<=arr.length;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=W;j++){
                if(arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }
        return dp[arr.length][W];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int[] arr2 = {3, 34, 4, 12, 5, 2};
        int sum2 = 30;
        System.out.println(SubSetSum(arr,sum,arr.length-1));
        System.out.println(SubSetSum(arr2,sum2,arr2.length-1));
          System.out.println(SubSetSumDP(arr,sum));
        System.out.println(SubSetSumDP(arr2,sum2));
    }
}
