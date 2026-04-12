import java.util.*;
package Graphs
public class AdjList {
    static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int n) {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int nei : adj.get(node)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }
        System.out.println();
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        System.out.print(node + " ");

        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u); // remove if directed
        }

        bfs(0, adj, n);

        boolean[] vis = new boolean[n];
        System.out.print("DFS: ");
        dfs(0, adj, vis);
    }
}