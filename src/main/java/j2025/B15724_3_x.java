package j2025;

import java.io.*;

// 백준 15724번 : 주지수 ( 공식.. 잘 모르나 )
public class B15724_3_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] arr = new int[n+1][m+1];

        for (int i = 1; i < n+1; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j < m+1; j++) {
                arr[i][j] = Integer.parseInt(line[j-1]) + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }
        }
        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            String[] inp = br.readLine().split(" ");
            int x1 = Integer.parseInt(inp[0]);
            int y1 = Integer.parseInt(inp[1]);
            int x2 = Integer.parseInt(inp[2]);
            int y2 = Integer.parseInt(inp[3]);

            bw.write(arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
