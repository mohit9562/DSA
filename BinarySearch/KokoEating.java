package BinarySearch;
import java.util.*;
public class KokoEating {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length - 1];
        long hour = 0;
        while(left<=right){
            int mid = left + (right - left) / 2;
            hour = 0;
            for(int i = 0; i < piles.length; i++){
                hour += (piles[i] + mid - 1) / mid; 
            }
            if(hour <= h){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Koko should eat at a speed of : "+left);

    }
}
