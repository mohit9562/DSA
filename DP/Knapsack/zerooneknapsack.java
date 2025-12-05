package DP.Knapsack;
import java.util.*;
public class zerooneknapsack {
    public static int knapsack(int[] wt,int[] val,int[][] dp,int W,int n){
          if(n == val.length-1 || W == 0){
            return 0;
    }     
            if(wt[n]<=W){
                int include = val[n] + knapsack(wt,val,dp,W-wt[n],n+1);
                int exclude = knapsack(wt,val,dp,W,n+1);
                dp[n][W]  = Math.max(include,exclude);
            }else{
                dp[n][W] =  knapsack(wt,val,dp,W,n+1);
            }
             return dp[n][W];
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] wt = {1,3,7,5};
        int[] val = {2,9,8,7};
        int W = 11;
        int[][] dp = new int[wt.length+1][W+1];
         for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        System.out.println(knapsack(wt,val,dp,W,0));
    }
}
