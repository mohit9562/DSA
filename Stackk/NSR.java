package Stackk;
import java.util.*;
class NSR{
    public static void main(String[] args) {
       int[] arr={4,5,2,10,8};
       int size = arr.length;
       int[] nsr = new int[size];
       Stack<Integer> stack = new Stack<>();
       for(int i = arr.length-1;i>=0;i--){
        int temp = arr[i];
        while(!stack.isEmpty() && stack.peek() >= temp){
            stack.pop();
        }
        if(stack.isEmpty()){
            nsr[i] = Integer.MIN_VALUE;
       }else{
        nsr[i] = stack.peek();
       }
       stack.push(temp);
       }
         System.out.println(Arrays.toString(nsr));
}
}

/*Next Smaller Element to the Right
similar to NGR but we are checking for smaller elements
The basic ideas is that Stack eliminates the use of the inner loop which is from j = i + 1 to size
 4 , 5 , 2 , 10 , 8  Stack stores the elements of the array which are right to the current element
 We will traverse the array in the reverse manner 
 so for 8 -> Stack is empty so we will store MIN_VALUE
    for 10 -> Stack has 8 so we will store it as it is less than 10 and push 10 onto stack
    for 2 -> Stack has 10 on the top so we pop it and check next we get 8 we pop it which is empty so we store MIN_VALUE and push 2 onto stack
    for 5 -> Stack has 2 smaller that 5  so we store it and push 5 onto stack
    for 4 -> Stack has 5 on the top so we pop it and check next which is 2 so we store it. 
Time Complexity : O(n)
Space Complexity : O(n)
*/