import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] tasks = new int[size];
        int[] hours = new int[size];
        for(int i = 0;i<size;i++){
            tasks[i] = in.nextInt();
        }
        for(int i = 0;i<size;i++){
            hours[i] = in.nextInt();
        }
        int k = in.nextInt();
        int lower = in.nextInt();
        int upper = in.nextInt();
        int work = in.nextInt();
        int l = 0;
        int tasksum = 0;
        int hoursum = 0;
        int ans = 0;
        for(int i = 0;i<k;i++){
             tasksum += tasks[i];
             hoursum += hours[i];
        }
       for(int r = k;r<size+1;r++){
        
            if(tasksum < lower && hoursum >= work){
                    ans -= 2;
              }else if(tasksum < lower && hoursum<work ){
                   ans -= 1;
              }else if(tasksum >= upper && hoursum>=work){
                   ans += 1;
              }else if(tasksum >= upper && hoursum<work){
                  ans += 2;
              }
        
        if(r < size){
             tasksum += tasks[r]-tasks[l];
            hoursum += hours[r]-hours[l];
            l++;
        }   
        }
        System.out.println(ans);
    }
}
