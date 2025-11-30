package CSES;
import java.util.*;
public class Permutations {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long size = in.nextInt();
       if(size<4 && size!=1){
        System.out.println("NO SOLUTION");
         return;
       }
       if(size==1){
        System.out.print(1);
        return;
       }
       StringBuilder str = new StringBuilder();
       for(int i = 2;i<=size;i+=2){
         str.append(i).append(" ");
       }
       for(int i = 1;i<=size;i+=2){
        str.append(i).append(" ");
       }
       
       System.out.println(str.toString().trim());
       in.close();
       return;
      }
      }
       

          

    
 




