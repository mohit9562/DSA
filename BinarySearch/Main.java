package BinarySearch;
import java.util.*;
public class Main {
    public static double maxlen(long[] arr,long n,long k,long max){
            double left = 1;
            double right = max;
            System.out.println(max);
            while(left<=right){
                 int piece = 0;
                 int mid = (int)(left + (right - left) / 2);
                for(int i=0;i<n;i++){
                    piece += arr[i]/mid;
                }
                if(piece >= k){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            return right;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long max = Long.MIN_VALUE;
        long[] arr = new long[(int)n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextLong();
            max = Math.max(max,arr[i]);
        }
        System.out.printf("%.2f",maxlen(arr,n,k,max));

    }
}
