package BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6,12,34};
        int target = 17;
        int result = searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);
    }
}

//Logic : Find the minimum element which is just greater than or equal to the target and return its index.