package BinarySearch;
import java.util.*;
public class Frequency {
    public static int freq(int[] arr, int target){
    int a = FirstandLast.first(arr, target);
    if (a == -1) return 0; 
    int b = FirstandLast.last(arr, target);
    return b - a + 1;
}

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,7,8,8,8,8};
        System.out.println("The frequency of the given target is "+freq(arr, 2));
    }
}
