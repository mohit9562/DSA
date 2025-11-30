package Trees;
//uses Horizontal Distance concept
import java.util.*;
class Node{
   public Node left;
   public Node right;
   public int data;
   Node(int data){
     this.data = data;
     this.left = null;
     this.right = null;
   }  
}
public class TopView {
    public static void topview(Node root){
       TreeMap<Integer,Node> map = new TreeMap<>();
       dfs(root,map,0);
       for(Map.Entry<Integer,Node> v: map.entrySet()){
        System.out.print(v.getValue().data+" ");
       }
       return;
        
    }
    public static void dfs(Node root,TreeMap<Integer,Node> map,int hd){
        if(root == null) return;
        if(!map.containsKey(hd)){
              map.put(hd,root);
        }
        dfs(root.left, map, hd-1);
        dfs(root.right,map,hd+1);
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(10);
        n.right = new Node(15);
        n.left.left = new Node(20);
        n.left.right = new Node(30);
        n.right.left = new Node(25);
        n.right.left.right = new Node(31);
        topview(n);
        

    }
}
