package Stackk;
import java.util.*;
class NGR{
    public static void main(String[] args) {
       int[] arr={4,5,2,10,8};
       int size = arr.length;
       int[] ngr = new int[size];
       Stack<Integer> stack = new Stack<>();
       for(int i = size-1;i>=0;i--){
        int temp = arr[i];
        while(!stack.isEmpty() && stack.peek() <= temp){
            stack.pop();
        }
        if(stack.isEmpty()){
            ngr[i] = Integer.MAX_VALUE;
       }else{
        ngr[i] = stack.peek();
       }
       stack.push(temp);
       }
         System.out.println(Arrays.toString(ngr));
}
}


/*Next Greater Element to the Right

The basic ideas is that Stack eliminates the use of the inner loop which is from j = i+1 to size
 4 , 5 , 2 , 10 , 8  Stack stores the elements of the array which are right to the current element
 We will traverse the array in the reverse manner 
 so for 8 -> Stack is empty so we will store MAX_VALUE
    for 10 -> Stack has 8 so we will pop it and continue to do until we get a big number than 10 but if empty we store MAX_VALUE
    for 2 -> Stack has 10 on the top so we store 10
    for 5 -> Stack has 2 on the top so we pop it and check next which is 10 so we store 10
    for 4 -> Stack has 5 on the top so we store 5
Time Complexity : O(n)
Space Complexity : O(n)
*/