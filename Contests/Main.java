package Contests;
import java.io.*;
import java.util.*;

import javax.imageio.metadata.IIOMetadataFormat;

public class Main {
    static class IO {
        BufferedReader br;
        StringTokenizer st;
        PrintWriter out;

        IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        // Input methods
        String sol() { // single word
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
        String next() { return sol(); } // single word
        String nextLine() { // full line
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }

        // Output methods
        void print(Object o) { out.print(o); }
        void println(Object o) { out.println(o); }
        void flush() { out.flush(); }
    }

    public static void main(String[] args) {
        IO sc = new IO();

        // Example usage
        int a = sc.nextInt();
        long b = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.nextChar();
        String word = sc.next();
        String line = sc.nextLine();

        sc.println("Int: " + a);
        sc.println("Long: " + b);
        sc.println("Float: " + f);
        sc.println("Double: " + d);
        sc.println("Char: " + c);
        sc.println("Word: " + word);
        sc.println("Line: " + line);

        sc.flush();
    }
}
