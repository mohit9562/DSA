package BinarySearch;
import java.util.*;
public class SmallestCommon {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7}
        };
        

        for(int i = 0;i<arr[0].length;i++){
            int val = arr[0][i];
            int count = 0;
            for(int j = 1;j<arr.length;j++){
                int left = 0;
                int right = arr[j].length-1;
                while(left<=right){
                    int mid = left + (right - left) / 2;
                    if(arr[j][mid] == val){
                        count++;
                        break;
                    } else if(arr[j][mid] < val) {
                        left = mid + 1; 
                    } else {
                        right = mid - 1; 
                    }
                }
            }
            if(count==arr.length-1){
                System.out.println("Smallest common element is: " + val);
                return;
            }
        }
    }
}
