package Stackk;
import java.util.*;
public class DailyTemparature {
     public static int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[size];
        for(int i = size-1;i>=0;i--){
            int temp = temperatures[i];
            while(!s.isEmpty() && temp >= temperatures[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){ 
                arr[i] = 0;
            }else{
                arr[i] = s.peek()-i;
            }
            s.push(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));

    }
}


/*Daily Temparature
739. Daily Temperatures

Given an array of integers temperatures represents the daily temperatures, 
return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. 
If there is no future day for which this is possible, keep answer[i] == 0 instead.
temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
*/