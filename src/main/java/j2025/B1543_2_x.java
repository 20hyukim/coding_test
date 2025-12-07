package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 이거 i-- 하게 되면 무한 루프나 다른 문제 발생 가능. 따라서, 이렇게 하면 안됨.
public class B1543_2_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        String has = br.readLine();

        int sentence_len = sentence.length();
        int idx = 0;
        int cnt = 0;

        for (int i = 0; i < sentence_len; i++) {
            if (sentence.charAt(i) == has.charAt(idx)) {
                idx++;
                if (idx == has.length()) {
                    cnt++;
                    idx = 0;
                }
            } else {
                if (idx > 0) {
                    idx = 0;
                    i--;
                }
            }
        }
        System.out.println(cnt);

    }

}
