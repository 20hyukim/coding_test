package b2026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1343번 : 폴리오미노
public class B1343_o {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inp = br.readLine();
        int len = inp.length();
        int xCnt = 0;

        for (int i = 0; i < len; i++) {
            if (inp.charAt(i) == '.') {
                if (xCnt != 0) {
                    if (xCnt %2 != 0) {
                        xCnt = -1;
                        break;
                    }
                    addC(xCnt);
                    xCnt = 0;
                }
                sb.append('.');
                continue;
            }
            xCnt ++;
        }

        if (xCnt == -1 || xCnt % 2 != 0) {
            System.out.println(-1);
            return;
        }
        addC(xCnt);
        System.out.println(sb);
    }

    private static void addC(int xCnt) {
        if (xCnt == 0) {
            return;
        }

        if (xCnt >= 4) {
            sb.append("AAAA");
            addC(xCnt - 4);
        } else {
            sb.append("BB");
            addC(xCnt - 2);
        }
    }
}
