import java.util.*;
public class FirstNegativeOfSizek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        int c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
          int[] sol = new int[n - k + 1];
        Queue<Integer> q = new LinkedList<>();
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
            if(i-l+1 == k){
                while(!q.isEmpty() && q.peek() < l){
                    q.poll();
                }
                if(!q.isEmpty()){
                    sol[c++] = arr[q.peek()];
                } else {
                    sol[c++] = 0;
                }
             l++;
            }
        }
        System.out.println(Arrays.toString(sol));
    }
}


//using queue track the indices of negative numbers in the current window
//when the window size reaches k, check the front of the queue for the first negative number
//if the index at the front is out of the current window, remove it from the queue
