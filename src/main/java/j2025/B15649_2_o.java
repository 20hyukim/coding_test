package j2025;

import java.io.*;

// 백준 15649번 : N과 M (1)
public class B15649_2_o {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int maxNum;
    static int resultLen;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inp = br.readLine().split(" ");
        maxNum = Integer.parseInt(inp[0]);
        resultLen = Integer.parseInt(inp[1]);

        boolean[] visited = new boolean[maxNum+1];
        int[] answer = new int[resultLen];
        dfs(0, visited, answer);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int cnt, boolean[] visited, int[] answer) throws IOException {
        if (cnt == resultLen) {
            for (int i = 0; i < resultLen; i++) {
//                System.out.println(answer[i] + "ddd");
                bw.write(answer[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i < maxNum+1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[cnt] = i;
                cnt++;
                dfs(cnt, visited, answer);
                visited[i] = false;
                cnt--;
            }
        }
    }
}
