package Trees;
//Height of a Node,Number of Nodes,Sum of the Nodes,Diameter of a node
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
public class Klevel {
  public static void klevel(Node root,int l){
      ArrayList<Integer> arr = bfs(root,l);
      for(int i : arr){
        System.out.println(i+" ");
      }

  }
  public static ArrayList<Integer> bfs(Node root,int l){
    Queue<Node> q = new LinkedList<>();
     ArrayList<Integer> arr = new ArrayList<>();
    q.add(root);
    int level = 1;
    while(!q.isEmpty()){
      int s = q.size();
      if(level==l){     
         for(int i = 0;i<s;i++){
          arr.add(q.poll().data);
         }
         break;
      }
      for(int i = 0;i<s;i++){
          Node curr = q.poll();
         if(curr.left!=null){
        q.add(curr.left);
         }
         if(curr.right!=null){
        q.add(curr.right);
      }
     
    }
     level++;
      
    }
    return arr;
  }
    
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(10);
        n.right = new Node(15);
        n.left.left = new Node(20);
        n.left.right = new Node(30);
        n.right.left = new Node(25);
        n.right.left.right = new Node(31);
        klevel(n, 4);
         

    }
}
