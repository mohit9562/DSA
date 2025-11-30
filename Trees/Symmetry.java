package Trees;

 import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Symmetric {
    public static void RLR(TreeNode root, ArrayList<Integer> l) {
        if(root == null) {
            l.add(Integer.MAX_VALUE);
            return;
        }
        l.add(root.val);
        RLR(root.left, l);
        RLR(root.right, l);
    }
    public static void RRL(TreeNode root, ArrayList<Integer> l) {
        if(root == null) {
            l.add(Integer.MAX_VALUE);
            return;
        }
        l.add(root.val);
        RRL(root.right, l);
        RRL(root.left, l);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        RLR(root.left, arr1);
        RRL(root.right, arr2);

        for(int i = 0; i < arr1.size(); i++) {
            if(!arr1.get(i).equals(arr2.get(i))) {
                return false;
            }
        }
        return true;
    }
}

public class Symmetry {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Symmetric sol = new Symmetric();
        boolean result = sol.isSymmetric(root);

        System.out.println("Is the tree symmetric :  " + result);
    }
}

