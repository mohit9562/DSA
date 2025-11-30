package CSES;
import java.util.*;
public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> odd = new ArrayList<>();
        String str = in.next();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        String sol = "";
        for(char ch: map.keySet()){
           if(map.get(ch)%2==0){
            sol += (ch+"").repeat(map.get(ch)/2);
            odd.add(ch);
           }
        }
        for(char ch: odd){
            map.remove(ch);
        }
        String reversed = new StringBuilder(sol).reverse().toString();
        if(map.size()>1){
            System.out.println("NO SOLUTION");
            return;
        }
        for(char ch: map.keySet()){
            sol += (ch+"").repeat(map.get(ch));
           }
        
        
        sol+=reversed;
        System.out.println(sol);


    }

}

