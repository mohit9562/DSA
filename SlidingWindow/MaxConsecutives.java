import java.util.*;
//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int l = 0;
        int r = 0;
        int zerocount = 0;
        int max = 0;
        while(r < n){
             if(arr[r] == 0){
                 zerocount++;
             }
             while(zerocount > k){
                 if(arr[l] == 0){
                     zerocount--;
                 }
                 l++;
             }
                max = Math.max(max, r - l + 1);
                r++;
        }
        System.out.println(max);
        return;
    }
}
