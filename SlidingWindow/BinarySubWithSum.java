import java.util.*;
public class BinarySubWithSum {
    public static int atmostK(int[] arr, int size, int s) {
        if(s < 0) return 0;
        int l = 0;
        int count = 0;
        int r = 0;
        int sum = 0;
        while(r < size) {
            sum += arr[r];
            while(sum  > s) {
                sum -= arr[l];
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
         int s = in.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            int result = atmostK(arr, size, s) - atmostK(arr, size, s - 1);
            System.out.println(result);
            return;
    }
}



// https://leetcode.com/problems/binary-subarrays-with-sum/description/
// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4 
//  {1,0,1}, {0,1,0}, {1,0,1}, {1,0,1,0,1}
// the basic logic in finding exactly k sum subarrays is to find atmost k sum subarrays - atmost (k - 1) sum subarrays
// in case of exactly problems use atmost function
//find subarrays with sum atmost k  
// find subarrays with sum atmost (k - 1)
// subtract both to get subarrays with exactly k sum