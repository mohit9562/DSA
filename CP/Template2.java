import java.util.*;

public class TemplateScanner {

    static final int MOD = 1_000_000_007;
    static final int INF = (int)1e9;
    static final long INF_L = (long)1e18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();   // number of testcases

        while (t-- > 0) {
            solve(sc, out);
        }

        System.out.print(out.toString());
        sc.close();
    }

    static void solve(Scanner sc, StringBuilder out) {

        // Example template read format:
        // int n = sc.nextInt();
        // long[] arr = new long[n];
        // for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

        // out.append(result).append("\n");
    }
}
