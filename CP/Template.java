import java.io.*;
import java.util.*;

public class Template {

    static final int MOD = 1_000_000_007;      // 10^9 + 7
    static final int INF = (int) 1e9;          // Integer Infinity
    static final long INF_L = (long) 1e18;     // Long Infinity

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            st = null;
            return br.readLine();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int test = fs.nextInt();   

        while (test-- > 0) {
            solve(fs, out);
        }

        System.out.print(out.toString());
    }

    static void solve(FastScanner fs, StringBuilder out) throws Exception {

        int n = fs.nextInt();   
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long x = fs.nextLong();
        }

        // ✅ FAST OUTPUT
        out.append(sum).append("\n");
    }
}
