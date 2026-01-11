package b2026;

import java.io.*;

// 백준 15724번 : 주지수
public class B15724_3_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] arr = new int[n+1][m+1];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                arr[i+1][j+1] = Integer.parseInt(line[j]) + arr[i][j+1] + arr[i+1][j] - arr[i][j];
            }
        }

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            String[] xys = br.readLine().split(" ");
            int x1 = Integer.parseInt(xys[0]);
            int y1 = Integer.parseInt(xys[1]);
            int x2 = Integer.parseInt(xys[2]);
            int y2 = Integer.parseInt(xys[3]);

            bw.write(arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
