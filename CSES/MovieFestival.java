import java.util.*;
import java.io.*;
class Movie{
    long start;
    long end;
    Movie(long start,long end){
        this.start=start;
        this.end=end;
    }
}
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
public class MovieFestival {
    public static void main(String[] args) {
        IO in = new IO();
        int n = in.nextInt();
        Movie[] arr = new Movie[n];
        for(int i=0;i<n;i++){
            long start = in.nextLong();
            long end = in.nextLong();
            arr[i]= new Movie(start,end);
        }
        Arrays.sort(arr,(a,b)->{
            return Long.compare(a.end,b.end);
        });
        int count = 0;
        long time = 0;
        for(int i = 0;i<n;i++){
            if(arr[i].start >= time){
                count++;
                time = (int)arr[i].end;
            }
        }
        System.out.println(count);

    }
}
