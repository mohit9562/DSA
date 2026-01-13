import java.util.*;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String str = in.next();
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        int left = 0;
        int max = 0;
        for(int i = 0; i < size; i++){
            while(set.contains(arr[i])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[i]);
            max = Math.max(max, i - left + 1);
        }
        System.out.println(max);
        in.close();
        return;
    }
}


// abcddefg