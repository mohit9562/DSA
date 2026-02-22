class DSU {
    int[] parent;
    int[] size;
    int components;

    DSU(int n) {
        parent = new int[n + 1];   // for zero based index declare size of n only 
        size = new int[n + 1];
        components = n;

        for (int i = 1; i <= n; i++) {   //for zero based index iterate from o to n only
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]); 
        return parent[x];
    }

    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);1111111111111111111111111111

        if (pa == pb) return;
        // union by size
        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }

        components--;
    }

    int getComponents() {
        return components;
    }
}
