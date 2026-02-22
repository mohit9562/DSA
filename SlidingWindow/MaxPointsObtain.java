import java.util.*;
public class MaxPointsObtain {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] cardPoints = new int[n];
        for(int i = 0; i < n; i++) {
            cardPoints[i] = in.nextInt();
        }
        int lsum = 0;
        for(int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        int max = lsum;
        int rsum = 0;
        for(int i = 0; i < k; i++) {
            rsum += cardPoints[n - 1 - i];
            lsum -= cardPoints[k - 1 - i];
            max = Math.max(max, lsum + rsum);
        }
        System.out.println(max);
    }
}



// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

// cardPoints = [1,2,3,4,5,6,1], k = 3
//   Output: 12

//   initially lsum = 1 + 2 + 3 = 6   rsum = 0 max = 6
//             lsum = 1 + 2 = 3   rsum = 1   max = 6
//             lsum = 1       rsum = 1 + 6 = 7   max = 8
//             lsum = 0       rsum = 1 + 6 + 5 = 12   max = 12
//             so there are k + 1 combinations possible
//             (1,2,3), (1,2,1), (1,6,1), (5,6,1)
// every time we remove one element from lsum and add one element to rsum therefore iterating through all combinations

  