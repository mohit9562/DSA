import java.util.*;
public class LongestSubstrwithevenvowels{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        HashMap<Integer,Integer> map = new HashMap<>();
        int mask = 0;
        int len = 0;
        map.put(0,-1);
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a') mask ^= (1 << 0);
            else if(c == 'e') mask ^= (1 << 1);
            else if(c == 'i') mask ^= (1 << 2);
            else if(c == 'o') mask ^= (1 << 3);
            else if(c == 'u') mask ^= (1 << 4);
            if(map.containsKey(mask)){
                len = Math.max(len,i-map.get(mask));
            }else{
                map.put(mask,i);
            }
        }
         System.out.println(len);

    }
}
// This is basically prefix + hashmap type problem we cant apply sliding window as there exists no condition for moving the
// left pointer and right pointer they dont guarantee any optimal solution
// the other approach is prefix sum + hashmap at each index store the frequency of all the vowels and find if there exists any other combination
// in the past which would result in all vowels being even
//lets take a case
// eabieiae
// in this case at each index store all the vowels frequency 
// at idx = 0 , (a,e,i,o,u) = (0,1,0,0,0)
// at idx = 1 , (a,e,i,o,u) = (1,1,0,0,0)
// at idx = 2 , (a,e,i,o,u) = (1,1,0,0,0)
// at idx = 3 , (a,e,i,o,u) = (1,1,1,0,0)
// at idx = 4 , (a,e,i,o,u) = (1,2,1,0,0)
// at idx = 5 , (a,e,i,o,u) = (1,2,2,0,0)
// at idx = 6 , (a,e,i,o,u) = (2,2,2,0,0)
// at idx = 7 , (a,e,i,o,u) = (2,3,2,0,0)
// now lets see at idx 7 we know that only the frequency of e is odd and all other vowels are even 
// so we need to find if there exists any combination in the past which would result in only e being odd
//  and all other vowels being even. so the possible combinations would be 
// (0,1,0,0,0) , (0,3,0,0,0) , (0,1,2,0,0),(2,1,0,0,0),(2,3,0,0,0) etc.
// it becomes a tedious task to find all the combinations and check if they exist in the past or not 
// so we can use bitmasking to store the parity of vowels in a single integer 
// and then we can easily check if the required combination exists in the past or not by using bitwise operations.
//even - even = even
//odd - odd = even This is main thing why we are not concerned about counts 

