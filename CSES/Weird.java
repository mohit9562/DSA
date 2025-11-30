package CSES;
import java.util.*;
public class Weird {
    public static void weird(long n) {
        Set<Long> visited = new HashSet<>();
        StringBuilder sb = new StringBuilder(); 
        while (n != 1) {
            sb.append(n).append(" ");
            if (visited.contains(n)) break;
            visited.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sb.append("1");  // Append final 1
        System.out.println(sb.toString());
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long x = in.nextLong();
        weird(x);           
    
    }
}


//Use Higher data types like Long to avoid overflow issues with large numbers