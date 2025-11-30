package Graphs;
import java.util.*;
public class NoOfComponent {
     public static void main(String[] args){
        List<List<Integer>> l = new ArrayList<>();
        l.add(Arrays.asList(0, 1));
        l.add(Arrays.asList(1, 2));
        l.add(Arrays.asList(2, 3));
        l.add(Arrays.asList(4, 5));
        int sol = findNumberOfComponent(7,l);
        System.out.print(sol);
    }
    public static void dfs(List<List<Integer>> l,boolean[] vis,int start){
        vis[start] = true;
        for(int i:l.get(start)){
            if(!vis[i]){
                dfs(l,vis,i);
            }
        }
    }
    public static int findNumberOfComponent(int V, List<List<Integer>> edges) {
      List<List<Integer>> l = new ArrayList<>(V);
      for(int i = 0;i<V;i++){
        l.add(new ArrayList<>());
      }
      for(int i = 0;i<edges.size();i++){
        l.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        l.get(edges.get(i).get(1)).add(edges.get(i).get(0));
      }
      int component = 0;
      boolean[] vis = new boolean[V];
      for(int i = 0;i<V;i++){
        if(!vis[i]){
           component++;
           dfs(l,vis,i);
        }
      }
      return component;

    }
   
}

