package b2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 21921번 : 블로그 - 괜히 누적합으로 편하게 풀려다가 이리저리 돌아간 문제
public class B21921_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nx = br.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);

        int[] visitors = new int[n];
        String[] vs = br.readLine().split(" ");


        // original values 유지
        for (int i = 0; i < n; i++) {
            visitors[i] = Integer.parseInt(vs[i]);
        }

        // 초기 합
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += visitors[i];
        }

        int maxSum = sum;
        int count = 1;

        for (int i = x; i < n; i++) {
            sum += visitors[i] - visitors[i-x];

            if (sum > maxSum) {
                maxSum = sum;
                count = 1;
            } else if (sum == maxSum) {
                count ++;
            }

        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(count);
        }

    }
}
