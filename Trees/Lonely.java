package Trees;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Lonely {
    public static void lonely(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right!=null){
            System.out.print(root.right.val + " ");
        }
        if(root.right==null && root.left!=null){
            System.out.print(root.left.val + " ");
        }
        lonely(root.left);
        lonely(root.right);

    }
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   /
            4   5 6
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.left.left= new TreeNode(15);
        lonely(root);

    }
}

// Define the structure of a node



    
