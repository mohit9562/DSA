import java.util.*;

public class PackingRectangles {

    public static boolean ok(long side, long w, long h, long n){
        long a = side / w;
        long b = side / h;
        if(a == 0 || b == 0){
            return false;
        }
        return a >= n+b-1 / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long w = in.nextLong();
        long h = in.nextLong();
        long n = in.nextLong();

        long left = 0;
        long right = (long)1e18; 

        while(left <= right){
            long mid = left + (right - left) / 2;

            if(ok(mid, w, h, n)){
                right = mid-1;}
            else{
                left = mid + 1;
            }
                
        }

        System.out.println(left);
    }
}
