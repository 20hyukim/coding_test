package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

// 백준 1543번 : 문서 검색 - 틀린 답
public class B1543_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrs = br.readLine().split("");
        String[] has = br.readLine().split("");

        int cnt = 0;
        int idx = 0;

        for (String a : arrs) {
            if (Objects.equals(a, has[idx])) idx++;
            else idx = 0;

            if (idx == has.length) {
                cnt ++;
                idx = 0;
            }
        }

        System.out.println(cnt);
    }
}
