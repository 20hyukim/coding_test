package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1543번 : 문서 검색
// .split("")을 하게 되면 리스트의 맨 앞에 [ "", "a","b"] 이런 식으로 빈 ""이게 들어갈 수 있어서 안쓰는 게 좋음.
public class B1543_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();

        int cnt = 0;
        int idx = 0;

        while(true) {
            idx = doc.indexOf(word, idx);
            if (idx == -1) break;

            cnt++;
            idx += word.length();
        }



        System.out.println(cnt);
    }
}
