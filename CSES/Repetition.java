package CSES;
import java.util.*;
public class Repetition {
    public static void Repetition(String s) {
       int max = Integer.MIN_VALUE;
       int count = 1;
       for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
       }
       max = Math.max(max, count);
       System.out.println(max);
       return;

    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Repetition(s);           
    
    }
}


//Use Maths logic if found rather than using any Data Structure like HashSet or ArrayList


