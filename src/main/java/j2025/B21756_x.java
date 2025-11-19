package j2025;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 백준 21756번 : 지우개
public class B21756_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n보다 작거나 같은 가장 큰 2의 거듭제곱 찾기
        int result = 1;
        while (result * 2 <= n) {
            result *= 2;
        }

        System.out.println(result);
    }
}
