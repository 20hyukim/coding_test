package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class B16398_3_x {
    static int[] parent;
    public static class Edge {
        private int start;
        private int end;
        private int value;

        public Edge(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Edge> queue = new PriorityQueue<>(Comparator.comparing(e -> e.value));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            parent[i] = i;
        }


        for (int i = 0; i < n; i++) {
            String[] edges = br.readLine().split(" ");
            for (int j = i+1; j < n; j++) {
                queue.add(new Edge(i+1, j+1, Integer.parseInt(edges[j])));
            }
        }

        int cnt = 0;
        long cost = 0;

        while(cnt != n-1) {
            Edge edge = queue.poll();

            if (getParent(edge.start) != getParent(edge.end)) {
                cost += edge.value;
                setParent(edge.start, edge.end);
                cnt++;
            }
        }

        System.out.println(cost);
    }

    public static int getParent(int e) {
        if (e == parent[e]) {
            return e;
        }
        int root = getParent(parent[e]);
        parent[e] = root;
        return root;
    }

    public static void setParent(int e, int p) {
        int pParent = getParent(p);
        parent[pParent] = getParent(e);
    }
}
