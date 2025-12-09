package Stackk;
import java.util.*;
class NSL{
    public static void main(String[] args) {
       int[] arr={4,5,2,10,8};
       int size = arr.length;
       int[] nsl = new int[size];
       Stack<Integer> stack = new Stack<>();
       for(int i = 0;i<arr.length;i++){
        int temp = arr[i];
        while(!stack.isEmpty() && stack.peek() >= temp){
            stack.pop();
        }
        if(stack.isEmpty()){
            nsl[i] = Integer.MIN_VALUE;
       }else{
        nsl[i] = stack.peek();
       }
       stack.push(temp);
       }
         System.out.println(Arrays.toString(nsl));
}
}

/*Next Smaller Element to the Left
The basic ideas is that Stack eliminates the use of the inner loop which is from j = i-1 to 0
 4 , 5 , 2 , 10 , 8  Stack stores the elements of the array which are left to the current element
 We will traverse the array in the forward manner 
 so for 4 -> Stack is empty so we will store MIN_VALUE
    for 5 -> Stack has 4 which is smaller than 5 so we store 4
    for 2 -> Stack has 5 on the top so we pop it and check next which is 4 we pop it too and then stack is empty so we store MIN_VALUE
    for 10 -> Stack is empty so we store MIN_VALUE and push 10 onto stack
    for 8 -> Stack has 10 on the top so we pop it and check next which is empty so we store MIN_VALUE
Time Complexity : O(n)
Space Complexity : O(n)
*/