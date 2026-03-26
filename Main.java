import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
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
        StringBuilder out = new StringBuilder();

        int t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            int[] robots = new int[n];
            int[] spikes = new int[m];

            for(int i=0;i<n;i++) robots[i] = in.nextInt();
            for(int i=0;i<m;i++) spikes[i] = in.nextInt();

            Arrays.sort(spikes);

            String s = in.next();

            int disp = 0;

            int alive = n;

            int[] ans = new int[k];

            HashSet<Integer> dead = new HashSet<>();

            for(int i=0;i<k;i++){

                if(s.charAt(i)=='R') disp++;
                else disp--;

                for(int j=0;j<n;j++){

                    if(dead.contains(j)) continue;

                    int pos = robots[j] + disp;

                    int idx = Arrays.binarySearch(spikes,pos);

                    if(idx>=0){
                        dead.add(j);
                        alive--;
                    }
                }

                ans[i] = alive;
            }

            for(int x: ans)
                out.append(x).append(" ");

            out.append("\n");
        }

        System.out.print(out);
    }
}