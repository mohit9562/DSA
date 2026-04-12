package StackQueue;

import java.util.*;

public class Stackk {
    public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(10);
      st.push(5);
      st.push(15);
      System.out.println(st.peek());
      System.out.println(st.pop());
      System.out.println(st.size());
      System.out.println(st.search(5));
      System.out.println(st.isEmpty());
    }
}
