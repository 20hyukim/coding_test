package b2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 12865번 : 평범한 배낭
public class B12865_2_x {
    static Integer[][] dp;
    static int[] weights;
    static int[] values;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        weights = new int[n+1];
        values = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            String[] wv = br.readLine().split(" ");
            int w = Integer.parseInt(wv[0]);
            int v = Integer.parseInt(wv[1]);
            weights[i] = w;
            values[i] = v;
        }

        dp = new Integer[n+1][k+1];
        System.out.println(getMaxValue(n, k));

    }

    private static int getMaxValue(int n, int k) {
        if (n <= 0) return 0;

        if (dp[n][k] != null) return dp[n][k];

        if (k < weights[n]) return getMaxValue(n-1, k); // 물건을 넣을 수 없으면 안넣는 경우에다가

        dp[n][k] = Math.max(
                getMaxValue(n-1, k), // 안 넣는 경우
                getMaxValue(n-1, k - weights[n]) + values[n]); // 넣는 경우
        return dp[n][k];
    }
}
