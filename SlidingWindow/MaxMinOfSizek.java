import java.util.*;

public class MaxMinOfSizek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

  
        if(size < k){
            System.out.println(-1);
            return;
        }


        int temp = 0;
        for(int i = 0; i < k; i++){
            temp += arr[i];
        }

        int max = temp;
        int min = temp;

        int left = 0;
        for(int i = k; i < size; i++){
            temp += arr[i];    
            temp -= arr[left]; 
            left++;

            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        System.out.println(max);
        System.out.println(min);

        in.close();
    }
}
