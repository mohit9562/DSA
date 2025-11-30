package Trees;
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
public class BFS {
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                Node curr = q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        
        }
         return;

    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(10);
        n.right = new Node(15);
        n.left.left = new Node(20);
        n.left.right = new Node(30);
        n.right.left = new Node(25);
        bfs(n);

    }
}
