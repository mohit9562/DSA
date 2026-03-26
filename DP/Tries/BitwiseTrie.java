package DP.Tries;
class Node {
    Node[] children;
    boolean end;
    public Node() {
        children = new Node[2]; // For binary trie, we only need 2 children (0 and 1)
        end = false;
    }
}
class Trie{
    Node root;
    public Trie(){
        root =  new Node();
    }
    void insert(int num){
        Node temp = root;
        for(int i = 31;i>=0;i--){
            int bit = (num >> i) & 1;
            if(node.children[bit] == null){
                node.children[bit] = new Node();
            }
            node = node.children[bit];
        }
        node.end = true;
    }
}


public class BitwiseTrie {
    public static int findMaxXOR(Trie trie, int num) {
        Node temp = trie.root;
        int maxXOR = 0;
        for(int i = 31;i>=0;i--){
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit; // We want the opposite bit to maximize XOR
            if(temp.children[toggledBit] != null){
                maxXOR |= (1 << i); // Set the ith bit in maxXOR
                temp = temp.children[toggledBit];
            } else {
                temp = temp.children[bit]; // Move to the same bit if toggled bit is not available
            }
        }
        return maxXOR;
    }
    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        Trie trie = new Trie();
        trie.insert(nums[0]);
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            max = Math.max(max, findMaxXOR(trie, nums[i]));
            trie.insert(nums[i]);
        }
        System.out.println("Maximum XOR: " + max);

    }
}
