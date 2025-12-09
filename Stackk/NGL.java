package Stackk;
import java.util.*;
class NGL{
    public static void main(String[] args) {
       int[] arr={4,5,2,10,8};
       int size = arr.length;
       int[] ngl = new int[size];
       Stack<Integer> stack = new Stack<>();
       for(int i = 0;i<arr.length;i++){
        int temp = arr[i];
        while(!stack.isEmpty() && stack.peek() <= temp){
            stack.pop();
        }
        if(stack.isEmpty()){
            ngl[i] = Integer.MAX_VALUE;
       }else{
        ngl[i] = stack.peek();
       }
       stack.push(temp);
       }
         System.out.println(Arrays.toString(ngl));
}
}


/*Next Greater Element to the Left
The basic ideas is that Stack eliminates the use of the inner loop which is from j = i-1 to 0
 4 , 5 , 2 , 10 , 8  Stack stores the elements of the array which are left to the current element
 We will traverse the array in the forward manner 
 so for 4 -> Stack is empty so we will store MAX_VALUE
    for 5 -> Stack has 4 so we will pop it and continue to do until we get a big number than 5 but if empty we store MAX_VALUE
    for 2 -> Stack has 5 on the top and is greate than 2 so we store 5
    for 10 -> Stack has 2 on the top so we pop it and check next which is 5 we pop it too and then stack is empty so we store MAX_VALUE
    for 8 -> Stack has 10 on the top so we store 10
Time Complexity : O(n)
Space Complexity : O(n)
*/
