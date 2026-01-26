package b2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2748번 : 피보나치 수 2
public class B2748_o {
    static long[] fibo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        fibo = new long[n+1];

        System.out.println(getFibo(n));
    }

    private static long getFibo(int n) {
        if (n==0) return 0;
        if (n ==1 || n==2) return 1;

        if (fibo[n] != 0) return fibo[n];

        fibo[n] = getFibo(n-1) + getFibo(n-2);

        return fibo[n];
    }
}
