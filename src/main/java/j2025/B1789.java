package j2025;

import java.io.*;

// 백준 : 1789 : 수들의 합
public class B1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());
        long remain = s; int cnt = 0;

        for (long i = 1; i < s+1; i++) {
            if (2 * i + 1 <= remain) {
                cnt ++;
                remain -= i;
                continue;
            }
            cnt++;
            break;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();

        bw.close();
        br.close();
    }
}
