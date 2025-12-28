
import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("0"+"\n");
        for(int i = 2;i<=test;i++){
              long totalWays = (long) i*i * (i*i - 1) / 2;
              long attackWays = 4 * (i - 1) * (i - 2);
                long validWays = totalWays - attackWays;
                sb.append(validWays + "\n");
        }
        System.out.println(sb.toString());
    }
}

// The number of sub matrices of size a x b in a  n x n matrix  is (n-a+1)(n-b+1)
// so two knights can attack each other when matrix size is either (2x3) or (3x2)  so total ways = 2*(n-1)(n-2) and there would be 2 pair combination 
// hence 4*(n-1)*(n-2)
