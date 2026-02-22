package SegmentTree;

public class Segment {
    public static void main(String[] args) {
        
    }
}
// Array-based Segment Tree with Lazy Propagation for Range Updates and Range Queries
class SegmentTree {

    private int[] tree;
    private int[] lazy;
    private int n;

    // Constructor
    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];
        lazy = new int[4 * n];
        build(nums, 0, n - 1, 0);
    }

    // ---------------- BUILD ----------------
    private void build(int[] nums, int start, int end, int node) {
        if (start == end) {
            tree[node] = nums[start];
            return;
        }

        int mid = (start + end) / 2;

        build(nums, start, mid, 2 * node + 1);
        build(nums, mid + 1, end, 2 * node + 2);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    // ---------------- LAZY PROPAGATION HELPER ----------------
    private void pushDown(int node, int start, int end) {
        if (lazy[node] != 0) {
            // Apply pending update
            tree[node] += (end - start + 1) * lazy[node];

            // Propagate to children if not leaf
            if (start != end) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }

            lazy[node] = 0;
        }
    }

    // ---------------- RANGE UPDATE ----------------
    public void rangeUpdate(int l, int r, int val) {
        rangeUpdate(0, 0, n - 1, l, r, val);
    }

    private void rangeUpdate(int node, int start, int end, int l, int r, int val) {

        pushDown(node, start, end);

        // No overlap
        if (r < start || end < l)
            return;

        // Total overlap
        if (l <= start && end <= r) {
            lazy[node] += val;
            pushDown(node, start, end);
            return;
        }

        // Partial overlap
        int mid = (start + end) / 2;

        rangeUpdate(2 * node + 1, start, mid, l, r, val);
        rangeUpdate(2 * node + 2, mid + 1, end, l, r, val);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    // ---------------- POINT UPDATE ----------------
    public void pointUpdate(int idx, int val) {
        pointUpdate(0, 0, n - 1, idx, val);
    }

    private void pointUpdate(int node, int start, int end, int idx, int val) {

        pushDown(node, start, end);

        if (start == end) {
            tree[node] = val;
            return;
        }

        int mid = (start + end) / 2;

        if (idx <= mid)
            pointUpdate(2 * node + 1, start, mid, idx, val);
        else
            pointUpdate(2 * node + 2, mid + 1, end, idx, val);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    // ---------------- RANGE QUERY ----------------
    public int sumQuery(int l, int r) {
        return sumQuery(0, 0, n - 1, l, r);
    }

    private int sumQuery(int node, int start, int end, int l, int r) {

        pushDown(node, start, end);

        // No overlap
        if (r < start || end < l)
            return 0;

        // Total overlap
        if (l <= start && end <= r)
            return tree[node];

        int mid = (start + end) / 2;

        return sumQuery(2 * node + 1, start, mid, l, r)
             + sumQuery(2 * node + 2, mid + 1, end, l, r);
    }
}
