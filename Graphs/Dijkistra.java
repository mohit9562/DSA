package Graphs
import java.util.*;

public class Dijkstra {

    static class Edge {
        int to, weight;
        Edge(int t, int w) {
            to = t;
            weight = w;
        }
    }

    public static void dijkstra(int n, List<List<Edge>> graph, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];

            if (d > dist[node]) continue;
            for (Edge e : graph.get(node)) {
                int next = e.to;
                int newDist = d + e.weight;

                if (newDist < dist[next]) {
                    dist[next] = newDist;
                    pq.add(new int[]{next, newDist});
                }
            }
        }

        // Print result
        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5; // number of nodes

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Build graph from sample
        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(2, 4));

        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 7));

        graph.get(2).add(new Edge(4, 3));

        graph.get(3).add(new Edge(4, 1));

        graph.get(4).add(new Edge(3, 2));

        dijkstra(n, graph, 0); // run from source node 0
    }
}
