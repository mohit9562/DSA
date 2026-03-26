import java.io.*;
import java.util.*;

public class SlidingDistinct {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner in = new FastScanner();

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int l = 0;

        for (int r = 0; r < n; r++) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            if (r - l + 1 > k) {
                int freq = map.get(arr[l]);
                if (freq == 1) map.remove(arr[l]);
                else map.put(arr[l], freq - 1);
                l++;
            }

            if (r - l + 1 == k) {
                sb.append(map.size()).append(" ");
            }
        }

        System.out.println(sb);
    }
}