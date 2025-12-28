package BinarySearch;
//https://codeforces.com/edu/course/2/lesson/6/1/practice/contest/283911/problem/A
//Binary Search
import java.util.*;
import java.io.*;

public class Codeforces1 {
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

    public static boolean binarySeach(long[] arr,int l,int r,long key){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid] == key){
                return true;
            }else if(arr[mid]<key){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int size = (int) in.nextLong();
        long k = in.nextLong();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextLong();
        }
        
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = size-1;
    
       while(k-- > 0){
            long val = in.nextLong();
            if(binarySeach(arr,l,r,val)){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }


    System.out.println(sb.toString());

    }
}

//https://codeforces.com/edu/course/2/lesson/6/1/practice/contest/283911/problem/A
//Binary Search
