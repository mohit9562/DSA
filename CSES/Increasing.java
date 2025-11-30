package CSES;
import java.util.*;
public class Increasing {
    public static void Increasing(Long[] arr) {
       long count = 0;
       for(int i = 1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            count += arr[i-1]-arr[i];
            arr[i] = arr[i-1];
        }
       }
       System.out.println(count);
       return;

    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Long[] arr = new Long[size];
         for(int i = 0;i<size;i++){
            arr[i] = in.nextLong();
         }
         Increasing(arr);         
    
    }
}



