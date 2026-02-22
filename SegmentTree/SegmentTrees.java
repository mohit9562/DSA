package SegmentTree;
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
public static void update(Tree node, int start, int end, int index, int value) {
    if (start == end) {
        node.data = value;
        return;
    }
    int mid = (start + end) / 2;
    if (index <= mid) {
        update(node.left, start, mid, index, value);
    } else {
        update(node.right, mid + 1, end, index, value);
    }
    node.data = node.left.data + node.right.data; // Update current node after updating child
}
public static int query(Tree node, int start, int end, int l, int r) {
    if (r < start || end < l) {
        return 0; // No overlap
    }
    if (l >= start && end <= r) {
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





//  class SegmentTreeArray {

//     static int[] tree;
//     static int n;

//     // Build
//     public static void build(int[] arr, int node, int start, int end) {
//         if (start == end) {
//             tree[node] = arr[start];
//         } else {
//             int mid = (start + end) / 2;
//             build(arr, 2 * node, start, mid);
//             build(arr, 2 * node + 1, mid + 1, end);
//             tree[node] = tree[2 * node] + tree[2 * node + 1];
//         }
//     }

//     // Update (point update)
//     public static void update(int node, int start, int end, int idx, int val) {
//         if (start == end) {
//             tree[node] = val;
//         } else {
//             int mid = (start + end) / 2;
//             if (idx <= mid) {
//                 update(2 * node, start, mid, idx, val);
//             } else {
//                 update(2 * node + 1, mid + 1, end, idx, val);
//             }
//             tree[node] = tree[2 * node] + tree[2 * node + 1];
//         }
//     }

//     // Query (range sum)
//     public static int query(int node, int start, int end, int l, int r) {
//         if (r < start || end < l) {
//             return 0;  // No overlap
//         }
//         if (l <= start && end <= r) {
//             return tree[node];  // Total overlap
//         }
//         int mid = (start + end) / 2;
//         int leftSum = query(2 * node, start, mid, l, r);
//         int rightSum = query(2 * node + 1, mid + 1, end, l, r);
//         return leftSum + rightSum;
//     }

//     public static void main(String[] args) {

//         int[] arr = {3,8,7,6,-2,-8,4,9};
//         n = arr.length;

//         tree = new int[4 * n];

//         build(arr, 1, 0, n - 1);

//         System.out.println("Sum (1,3): " + query(1, 0, n - 1, 1, 3));
//         System.out.println("Sum (0,5): " + query(1, 0, n - 1, 0, 5));

//         update(1, 0, n - 1, 2, 10); // Change index 2 → 10

//         System.out.println("After update:");
//         System.out.println("Sum (1,3): " + query(1, 0, n - 1, 1, 3));
//     }
// }
//Array Based Implementation of Segment Tree
// size : 4*n (to be safe)
// left child : 2*node
// right child : 2*node + 1
