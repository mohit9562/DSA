import java.util.*;
public class SlidingWindowSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        long[] arr = new long[n];
        arr[0] = x;
        for(int i = 1;i<n;i++){
            arr[i] = (a*arr[i-1]+b) % c;
        }
        long sum = 0;
        long xor = 0;
        int l = 0;
        int r = 0;
        while(r < n){
            sum += arr[r];
            while(r-l+1 > k) sum -= arr[l++];
            if(r-l+1 == k) xor ^= sum;
            r++;
        }
        //  while(r < n){
        //     sum ^= arr[r];
        //     while(r-l+1 > k) sum ^= arr[l++];   // slidingwindow XOR
        //     if(r-l+1 == k) xor ^= sum;
        //     r++;
        // }
        System.out.print(xor);
    }
}