package Sorting;
import java.util.*;
public class BubbleSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-i-1; j++){
        if(arr[j] > arr[j+1]){
            swap(arr, j, j+1);
        }
    }
}

    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Basic Idea: Repeatedly step through the list, compare adjacent elements and swap them if they are in the wrong order.
//  The pass through the list is repeated until the list is sorted.
// Bubble Sort is a stable sorting algorithm.
// Example: Input: [5, 1, 4, 2, 8]
//          Output: [1, 2, 4, 5, 8]
// Steps:
// 1) Compare the first two elements (5 and 1). Since 5 > 1, we swap them. Array becomes [1, 5, 4, 2, 8].
// 2) Compare the next two elements (5 and 4). Since 5 > 4, we swap them. Array becomes [1, 4, 5, 2, 8].
// 3) Compare the next two elements (5 and 2). Since 5 > 2, we swap them. Array becomes [1, 4, 2, 5, 8].
// 4) Compare the next two elements (5 and 8). Since 5 < 8, we do not swap them. Array remains [1, 4, 2, 5, 8].
// 5) We have completed one pass through the array. The largest element (8) is now at the end.
// 6) We repeat the process for the remaining elements until the entire array is sorted.