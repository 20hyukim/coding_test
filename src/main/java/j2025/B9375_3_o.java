package j2025;

import java.io.*;
import java.util.HashMap;

// 백준 9375번 : 패션왕 신해빈
public class B9375_3_o {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            int clothes = Integer.parseInt(br.readLine());
            bw.write(getStyles(clothes) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getStyles(int clothes) throws IOException {
        HashMap<String, Integer> cntStyle = new HashMap<>();

        for (int i = 0; i < clothes; i++) {
            String[] style = br.readLine().split(" ");
            int cnt = cntStyle.getOrDefault(style[1], 0);
            cntStyle.put(style[1], ++cnt);
        }
        int total = 1;

        for (int v : cntStyle.values()) {
            total *= (v+1);
        }
        return total - 1;
    }
}
