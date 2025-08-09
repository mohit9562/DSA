package BinarySearch;
public class BinarySearch{
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1; 
            }   
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }  
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right); // Search in the right half
        }


        return binarySearchRecursive(arr, target, left, mid - 1); // Search in the left half
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 77;
        int result = binarySearch(arr, target);
        int result2 = binarySearchRecursive(arr, 8, 0, arr.length - 1);
                   
        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found");
         System.out.println(result2 != -1 ? "Element found at index: " + result2 : "Element not found");
    }
   
}
