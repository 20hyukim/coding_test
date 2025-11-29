package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 21756번 : 지우개
public class B21756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n+1; i++) {
            cnt += (int) Math.pow(2, i);
            if (cnt >= n) {
                System.out.println((int)Math.pow(2,i));
                return;
            }
        }
    }
}
