package CSES;
import java.util.*;
import java.io.*;
public class FerrisWheel {
      static class IO {
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



    public static long ferrisWheel(long[] arr, long limit) {
        Arrays.sort(arr);
        int l = 0;
        int j = arr.length - 1;
        long count = 0;

        while (l <= j) {
            if (arr[l] + arr[j] <= limit) {
                l++;   
            }
            j--;       
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        IO in = new IO();

        long size = in.nextLong();
        long limit = in.nextLong();

        long[] arr = new long[(int)size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLong();
        }

        System.out.println(ferrisWheel(arr, limit));
    }
}












  