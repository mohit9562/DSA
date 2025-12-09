package Stackk;

import java.util.Stack;

public class Prefix {
    public static int evaluate(String[] tokens) {
        int size = tokens.length;
        Stack<Integer> s = new Stack<>();
        for(int i = size-1;i>=0;i--){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                s.push(Integer.valueOf(tokens[i]));
            }else if(tokens[i].equals("+")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1+v2);
            }else if(tokens[i].equals("-")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1-v2);
            }else if(tokens[i].equals("*")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1*v2);
            }else if(tokens[i].equals("/")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1/v2);
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"+", "9", "*", "-", "8", "2", "/", "6","3"};
        System.out.println(evaluate(tokens));
    }
}