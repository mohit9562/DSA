package Graphs;
import java.util.*;

public class AdjMatrix {

    static void bfs(int start, int[][] graph, int n) {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println();
    }

    static void dfs(int node, int[][] graph, boolean[] vis, int n) {
        vis[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < n; i++) {
            if (graph[node][i] == 1 && !vis[i]) {
                dfs(i, graph, vis, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1; // remove if directed
        }

        bfs(0, graph, n);

        boolean[] vis = new boolean[n];
        System.out.print("DFS: ");
        dfs(0, graph, vis, n);
    }
}