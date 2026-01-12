package b2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 18352번 : 특정 거리의 도시 찾기
public class B18352_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = br.readLine().split(" ");

        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        int k = Integer.parseInt(inp[2]);
        int x = Integer.parseInt(inp[3]);

        List<Integer>[] directions = new ArrayList[n+1];

        for(int i = 1; i < n+1; i++) {
            directions[i] = new ArrayList<>();
        }


        for (int i = 0; i < m; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);

            directions[s].add(e);
        }

        int[] cost = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(x);

        cost[x] = 0;
        visited[x] = true;

        while(!queue.isEmpty()) {
            int city = queue.removeFirst();

            for (int c : directions[city]) {
                if (!visited[c]) {
                    cost[c] = cost[city] + 1;
                    queue.addLast(c);
                    visited[c] = true;
                }
            }

        }

        boolean spExists = false;


        for(int i = 1; i < n+1; i++) {
            if (cost[i] == k) {
                System.out.println(i);
                spExists = true;
            }
        }

        if (!spExists) System.out.println(-1);
    }
}
