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
public class BST {
    static int idx = 0;
    public static Node buildTree(Node root,int val){
        if(root == null) return new Node(val);
        if(val < root.data){
            root.left = buildTree(root.left,val);
        }else{
            root.right = buildTree(root.right,val);
        }
        return root;
    }
    public static void bfs(Node root) {
        if(root == null) return;
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
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().strip().split(" ");
        int[] arr = new int[s.length];
        for(int i = 0;i<arr.length;i++) arr[i] = Integer.parseInt(s[i]);
        Node root = null;
        for(int i =0;i<arr.length;i++){
            buildTree(root,arr[i]);
        }
        bfs(root);

    }
}
