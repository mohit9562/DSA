import java.util.*;
public class TwoSets {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
         long n = in.nextInt();
         if((n+1)/2 %2 !=0){
             System.out.println("NO");
             return;
         }
        
        System.out.println("YES");
        ArrayList<Long> set1 = new ArrayList<>();
        ArrayList<Long> set2 = new ArrayList<>();
        long first = (n+1)/2;
        long second = n - first;
        

   }
}
