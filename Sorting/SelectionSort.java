package Sorting;
import java.util.*;

public class SelectionSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minidx = i;

            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }

            if(minidx != i){
                swap(arr, i, minidx);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


//Time Complexity: O(n^2)
//Space Complexity: O(1)
// Selection Sort is not a stable sorting algorithm.
// It works by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.
// The algorithm maintains two subarrays in a given array:
// 1) The subarray which is already sorted.
// 2) The remaining subarray which is unsorted.
// In every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to the sorted subarray.
// Example: Input: [64, 25, 12, 22, 11]
//          Output: [11, 12, 22, 25, 64]
// Steps:
// 1) Find the minimum element in the array [64, 25, 12, 22, 11] which is 11 and swap it with the first element.
// 2) Find the minimum element in the array [25, 12, 22, 64] which is 12 and swap it with the second element.
// 3) Find the minimum element in the array [25, 22, 64] which is 22 and swap it with the third element.
// 4) Find the minimum element in the array [25, 64] which is 25 and swap it with the fourth element.
// 5) The last element is already sorted.   