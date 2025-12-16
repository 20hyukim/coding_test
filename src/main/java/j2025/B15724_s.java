package j2025;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 백준 15724번 : 주지수
class B15724_s {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 🔥 readLine() 누락된 () 추가
        String[] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);

        int[][] arr = new int[n][m];

        // 🔥 prefix sum by row
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
                if (j != 0)
                    arr[i][j] += arr[i][j - 1];
            }
        }

        // 🔥 입력 오류 수정: readLine().split()
        int cases = Integer.parseInt(br.readLine());

        for (int c = 0; c < cases; c++) {
            String[] xys = br.readLine().split(" ");

            // 🔥 빠진 변수들 추가
            int x1 = Integer.parseInt(xys[0]);
            int y1 = Integer.parseInt(xys[1]);
            int x2 = Integer.parseInt(xys[2]);
            int y2 = Integer.parseInt(xys[3]);

            int result = 0;

            // 🔥 row-based prefix sum → 부분합 계산
            // arr[i][j] = i번째 row의 0~j까지의 합
            for (int i = x1 - 1; i < x2; i++) {
                if (y1 > 1)
                    result += arr[i][y2 - 1] - arr[i][y1 - 2];
                else
                    result += arr[i][y2 - 1];
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}