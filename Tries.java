import java.util.*;

class Node {
    boolean end;
    Node[] children;

    Node() {
        end = false;
        children = new Node[26];  // automatically initialized to null
    }
}

class Trie {

    Node root;

    Trie() {
        root = new Node();
    }

    // Insert a word
    void insert(String word) {
        Node temp = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
            }

            temp = temp.children[idx];
        }

        temp.end = true;
    }

    // Search for a complete word
    boolean search(String word) {
        Node temp = root;

        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (temp.children[idx] == null) {
                return false;
            }

            temp = temp.children[idx];
        }

        return temp.end;
    }

    // Check if prefix exists
    boolean startsWith(String prefix) {
        Node temp = root;

        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';

            if (temp.children[idx] == null) {
                return false;
            }

            temp = temp.children[idx];
        }

        return true;
    }
        String getRoot(String word) {
        Node temp = root;
        StringBuilder prefix = new StringBuilder();

        for (char c : word.toCharArray()) {

            int idx = c - 'a';

            if (temp.children[idx] == null) {
                return word;
            }

            prefix.append(c);
            temp = temp.children[idx];

            if (temp.end) {
                return prefix.toString();
            }
        }

        return word;
    }
}

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.startsWith("app")); // true
        System.out.println(trie.search("ap"));      // false

    }
