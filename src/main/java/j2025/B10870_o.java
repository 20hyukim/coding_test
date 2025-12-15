package j2025;

import java.io.*;

// 백준 10870 : 피보나치 수 5
public class B10870_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+2];

        dp[1] = 1;

        for (int i = 2; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        bw.write(String.valueOf(dp[n]));

        bw.flush();
        bw.close();
        br.close();
    }

}
