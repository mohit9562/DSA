package DivideAndConquer;
import java.util.*;
public class MergeSort {
    public static void mergesort(int[] arr,int left,int right){
       if(left<right){
        int mid = left+(right-left)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
       }
       return;
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int[] r1 = new int[mid-left+1];
        int[] r2 = new int[right-mid];
        for(int i = 0;i<r1.length;i++){
            r1[i] = arr[left+i];
        }
        for(int i = 0;i<r2.length;i++){
            r2[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while(i<r1.length && j<r2.length){
            if(r1[i]<=r2[j]){
                arr[k++] = r1[i++];
            }else{
                arr[k++] = r2[j++];
            }
        }
        while(i<r1.length){
            arr[k++] = r1[i++];
        }
        while(j<r2.length){
            arr[k++] = r2[j++];
        }
        return;

    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        return;
    }
    public static void main(String[] args) {
        int[] arr = {9,2,4,1,7,8,11};
        print(arr);
        mergesort(arr,0,arr.length-1);
        print(arr);

    }
}
