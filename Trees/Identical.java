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
public class Identical {
    public static boolean Identical(Node p,Node q){
        if(p==null && q==null) return true;
        if(p!=null && q==null) return false;
        if(p==null && q!=null) return false;
        boolean leftsub = Identical(p.left, q.left);
        boolean rightsub = Identical(p.right, q.right);
        return leftsub && rightsub && p.data == q.data;
    }
     public static boolean isSubTree(Node p,Node q){
        if(p.data == q.data){
              boolean leftsub = Identical(p.left, q.left);
              boolean rightsub = Identical(p.right, q.right);
              return leftsub && rightsub && p.data == q.data;
        }
        return isSubTree(p.left,q) || isSubTree(p.right, q);  
    }
    
    public static void main(String[] args) {
        Node m = new Node(1);
        m.left = new Node(2);
        m.right = new Node(3);
        m.left.left = new Node(4);
        m.left.right = new Node(5);
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        
        System.out.println(isSubTree(n,m));
        

    }
}
