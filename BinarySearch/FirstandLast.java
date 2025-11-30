package BinarySearch;
import java.util.*;
public class FirstandLast {
    public static int first(int[] arr,int target){
        
        int idx = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                idx = mid;
                right = mid-1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return idx;
    }
    public static int last(int[] arr,int target){
         int idx = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                idx = mid;
                left = mid+1;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return idx;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,22,22,22,22,45,67,89};
        int target = 22;
        System.out.println("The first index of the given target is found at " + first(arr, target));
        System.out.println("The last index of the given target is found at "+last(arr, target));
    }
}
