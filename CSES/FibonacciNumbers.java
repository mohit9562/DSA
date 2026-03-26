
    import java.util.*;
    public class FibonacciNumbers {
    
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long n = in.nextLong();
            n = n % 1_000_000_007;
            long[] dp = new long[(int)n+1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++){
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
            }
            
            System.out.println(dp[(int)n]);
        }
    }
