import java.io.*;
import java.util.*;
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
 class CodeChef {

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
        FastScanner in = new FastScanner();
        StringBuilder out = new StringBuilder();

        int test = in.nextInt();   

        while (test-- > 0) {
            solve(in, out);
        }

        System.out.print(out.toString());
    }

    static void solve(FastScanner in, StringBuilder out) throws Exception {
             int size = in.nextInt();
                int[] arr = new int[size];
                int[] arr2 = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = in.nextInt();
                }
                for (int i = 0; i < size; i++) {
                    arr2[i] = in.nextInt();
                }
                Pair[] pairs = new Pair[size];
                for (int i = 0; i < size; i++) {
                    pairs[i] = new Pair(arr[i], arr2[i]);
                }
                Collections.sort(arr2,(a,b)->a-b);
                int sol = 0;
                for(int i = 0;i<pairs.length-1;i++){
                    sol += Math.max(pairs[i].a,pairs[i].b);
                }
                out.append(sol).append("\n");


    }
}
