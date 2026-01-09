package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 11720번 : 숫자의 합
public class B11720_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int total = 0;

        for (String n : nums) {
            total += Integer.parseInt(n);
        }

        System.out.println(total);
    }
}
