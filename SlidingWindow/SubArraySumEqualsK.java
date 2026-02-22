import java.util.*;
public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> Map = new HashMap<>();
        Map.put(0, 1);
        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;
            if (Map.containsKey(currentSum - k)) {
                count += Map.get(currentSum - k);
            }

            Map.put(currentSum, Map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int result =subarraySum(nums, k);
        System.out.println(result);
    }
}

//https://leetcode.com/problems/subarray-sum-equals-k/description/

//use prefix sum and hashmap to store frequency of prefix sums
// Input: nums = [1,1,1], k = 2
// Output: 2
// prefix sums = [1,2,3]
// for prefix sum 1, (1 - 2) = -1 not present
// for prefix sum 2, (2 - 2) = 0 present frequency
// for prefix sum 3, (3 - 2) = 1 present frequency
// so total count = 2
