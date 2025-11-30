package CSES;
import java.util.*;
public class Missing {
    public static void Missing(Long[] arr) {
       int size = arr.length+1;
       Long sum =(long) size*(size +1) /2;
         for (Long num : arr) {
              sum -= num;
         }
         System.out.println(sum);
         return;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long x = in.nextLong();
        Long[] arr = new Long[(int)(x-1)];
        for(int i=0;i<x-1;i++){
            arr[i]=in.nextLong();
        }
        Missing(arr);           
    
    }
}


//Use Maths logic if found rather than using any Data Structure like HashSet or ArrayList


