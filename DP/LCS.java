package DP;
import java.util.*;
public class LCS {
    public static int LCS(String s1,String s2,int n1,int n2){
           if(n1==0 || n2 == 0) return 0;
           if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            return 1+LCS(s1, s2, n1-1, n2-1);
           }
            int t1 = LCS(s1, s2, n1-1, n2);  // exclude last char of s1
            int t2 = LCS(s1, s2, n1, n2-1);  // exclude last char of s2 
            return Math.max(t1, t2);

    }
    public static int LCS_TD(String s1,String s2,int n1,int n2,int[][] dp){
        if(n1==0 || n2 == 0) return 0;
        if(dp[n1][n2] != -1) return dp[n1][n2];
           if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            return 1+LCS_TD(s1, s2, n1-1, n2-1,dp);
           }
            int t1 = LCS_TD(s1, s2, n1-1, n2,dp);  // exclude last char of s1
            int t2 = LCS_TD(s1, s2, n1, n2-1,dp);  // exclude last char of s2 
            return dp[n1][n2] = Math.max(t1, t2);
        
    }
    public static int LCS_BU(String s1,String s2,int n1,int n2){
         
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int n1 = s1.length();
        int n2 = s2.length();
        int result = LCS(s1, s2, n1, n2);
        int[][] dp = new int[n1+1][n2+1];
         for(int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println("Length of LCS is " + result);
         int result2 = LCS_TD(s1, s2, n1, n2,dp);
        System.out.println("Length of LCS is " + result2);
    }
}
