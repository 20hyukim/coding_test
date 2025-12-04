package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11653번 : 소인수분해
public class B11653_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max_n = n;

        INIT : while (n != 1) {
            for (int i = 2; i < max_n + 1; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n/i;
                    continue INIT;
                }
            }
        }
    }
}
