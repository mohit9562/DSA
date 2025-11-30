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
public class Height {
    public static int height(Node root) {
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;

    }
    public static int diameter(Node root) {
        if(root==null) return 0;
        return Math.max(Math.max(height(root.left)+height(root.right),diameter(root.left)),diameter(root.right));

    }
    public static int NumberOfNodes(Node root) {
        if(root == null) return 0;
        return NumberOfNodes(root.left)+NumberOfNodes(root.right)+1;

    }
     public static int SumOfNodes(Node root) {
        if(root==null) return 0;
        return SumOfNodes(root.left)+SumOfNodes(root.right) + root.data;

    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(10);
        n.right = new Node(15);
        n.left.left = new Node(20);
        n.left.right = new Node(30);
        n.right.left = new Node(25);
        n.right.left.right = new Node(31);
        System.out.println(height(n));
         System.out.println(NumberOfNodes(n));
          System.out.println(SumOfNodes(n));
          System.out.println(diameter(n));

    }
}
