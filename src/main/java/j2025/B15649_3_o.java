package j2025;

import java.io.*;

// 백준 15649번 : N과 M (1)
public class B15649_3_o {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, l;
    public static void main(String[] args) throws IOException {
        String[] inp = br.readLine().split(" ");
        n = Integer.parseInt(inp[0]);
        l = Integer.parseInt(inp[1]);

        boolean[] visited = new boolean[n+1];
        int[] arr = new int[l+1];

        dfs(visited, arr, 0);
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(boolean[] visited, int[] arr, int cnt) throws IOException {
        if (cnt == l) {
            for (int i = 0; i < l; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i < n+1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                cnt++;
                dfs(visited, arr, cnt);
                visited[i] = false;
                cnt--;
            }
        }
    }
}
