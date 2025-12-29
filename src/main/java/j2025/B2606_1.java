package j2025;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// 백준 2606번 : 바이러스
public class B2606_1 {
    static List<Integer>[] networks;
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int compN = Integer.parseInt(br.readLine());
        int couple = Integer.parseInt(br.readLine());

        networks = new ArrayList[compN+1];
        visited = new boolean[compN+1];

        for (int i = 1; i < compN+1; i++) {
            networks[i] = new ArrayList<>();
        }

        for (int i = 0; i < couple; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);

            networks[s].add(e);
            networks[e].add(s);
        }

        dfs(1);

        bw.write(cnt-1+"");
        bw.flush();

        bw.close();
        br.close();

    }

    private static void dfs(int n) {
        visited[n] = true;
        cnt += 1;

        for(int w : networks[n]) {
            if (visited[w]) {
                continue;
            }
            dfs(w);
        }
    }
}
