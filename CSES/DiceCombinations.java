import java.util.*;
import java.io.*;
class IO {
        BufferedReader br;
        StringTokenizer st;
        PrintWriter out;

        IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        
        String sol() { 
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(sol()); }
        long nextLong() { return Long.parseLong(sol()); }
        float nextFloat() { return Float.parseFloat(sol()); }
        double nextDouble() { return Double.parseDouble(sol()); }
        char nextChar() { return sol().charAt(0); }
        String next() { return sol(); } 
        String nextLine() { 
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }

    
        void print(Object o) { out.print(o); }
        void println(Object o) { out.println(o); }
        void flush() { out.flush(); }
    }
public class DiceCombinations {
    static long inff= 1000000007;
    public static long dice(long n,long[] dp){
           if(n<0) return 0;
           if(n == 0) return 1;
           if(dp[(int)n] != -1) return dp[(int)n];
           long count = 0;
           for(int i = 1;i<=6;i++){
              count += (dice(n-i,dp) % inff);
           }
           dp[(int)n] = count % inff;
           return dp[(int)n];
    }   
           
    public static void main(String[] args) {
        IO in = new IO();
    
        long n = in.nextLong();
        long[] dp = new long[(int)(n+1)];
        Arrays.fill(dp,-1);
        System.out.println(dice(n,dp));
    }
}
