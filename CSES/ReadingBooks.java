 import java.io.*;
import java.util.*;
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
public class ReadingBooks {
    public static long maxBooks(int[] arr){
      Arrays.sort(arr);
      long sum = 0;
      for(int i = 0;i<arr.length;i++){
        sum += arr[i];
      }
      return (long)Math.max(sum,2*arr[arr.length - 1]);
    }
  public static void main(String[] args) {
    IO in = new IO();
    long size = in.nextInt();
    int[] arr = new int[(int)size];
    for (int i = 0; i < size; i++) {
        arr[i] = in.nextInt();
    }
    long result = maxBooks(arr);
    in.println(result);
    in.flush();
  }    
}
