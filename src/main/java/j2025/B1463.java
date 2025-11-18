package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1463번 : 1로 만들기 - 시간 초과 ㅜ
public class B1463 {
    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        System.out.println(getMinVal(n));

    }

    private static int getMinVal(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        int min_val = getMinVal(n-1) + 1;

        if (n%2 == 0) {
            int two = getMinVal(n/2) + 1;
            min_val = Math.min(min_val, two);
        }

        if (n%3 == 0) {
            int three = getMinVal(n/3) + 1;
            min_val = Math.min(min_val, three);
        }

        dp[n] = min_val;
        return dp[n];
    }

}
