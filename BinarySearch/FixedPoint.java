package BinarySearch;
import java.util.*;
public class FixedPoint {
    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 3, 4, 7, 9};
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==mid){
                System.out.println("Fixed point found at index: " + mid);
                return;
            } else if(arr[mid] < mid) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        System.out.println("No fixed point found in the array.");
    }
}
