import java.util.*;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class SegmentTrees {
    public static Tree buildSegmentTree(int[] arr, int start, int end) {
    if (start == end) {
        return new Tree(arr[start]);
    }
    int mid = (start + end) / 2;
    Tree leftChild = buildSegmentTree(arr, start, mid);
    Tree rightChild = buildSegmentTree(arr, mid + 1, end);
    Tree node = new Tree(leftChild.data + rightChild.data);
    node.left = leftChild;
    node.right = rightChild;
    return node;
}
public static int query(Tree node, int start, int end, int l, int r) {
    if (r < start || end < l) {
        return 0; // No overlap
    }
    if (l <= start && end <= r) {
        return node.data; // Total overlap
    }
    int mid = (start + end) / 2;
    int leftSum = query(node.left, start, mid, l, r);
    int rightSum = query(node.right, mid + 1, end, l, r);
    return leftSum + rightSum; // Partial overlap
}
    public static void main(String[] args) {
        int[] arr={3,8,7,6,-2,-8,4,9};
        Tree root=buildSegmentTree(arr,0,arr.length-1);
        System.out.println("Segment Tree built successfully.");
        System.out.println("Sum of values in range (1, 3): " + query(root, 0, arr.length - 1, 1, 3));
        System.out.println("Sum of values in range (0, 5): " + query(root, 0, arr.length - 1, 0, 5));
    }
}
