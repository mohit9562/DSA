
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 class Tasks{
        long task;
        long deadline;
        Tasks(long task,long deadline){
            this.task=task;
            this.deadline=deadline;
        }
    }
public class TasksAndDeadLines {
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
   
    public static long tasksanddeadlines(Tasks[] arr){
        Arrays.sort(arr,(a,b)->{
            return Long.compare(a.task,b.task);
        });
        long reward = 0;
        long curr = 0;
        for(int i= 0;i<arr.length;i++){
            curr += arr[i].task;
            reward += arr[i].deadline-curr;
        }
        return reward;

    }

    
    public static void main(String[] args) {
        IO in = new IO();
        long size = in.nextLong();
        Tasks[] arr=new Tasks[(int)size];
        for(int i=0;i<size;i++){
            long task=in.nextLong();
            long deadline=in.nextLong();
            arr[i]=new Tasks(task,deadline);
        }
        System.out.println(tasksanddeadlines(arr));
    }
}
