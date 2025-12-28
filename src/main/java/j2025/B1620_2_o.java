package j2025;

import java.io.*;
import java.util.HashMap;

// 백준 1620번 : 나는야 포켓몬 마스터 이다솜
public class B1620_2_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int c = Integer.parseInt(inp[1]);

        HashMap<String, String> pokS = new HashMap<>();
        String[] pokI = new String[n+1];

        for (int i = 1; i < n+1; i++) {
            String name = br.readLine();
            pokI[i] = name;
            pokS.put(name, String.valueOf(i));
        }

        for (int i = 0; i < c; i++ ) {
            String s= br.readLine();
            String a = pokS.getOrDefault(s, "N");

            if (a.equals("N")) {
                a = pokI[Integer.parseInt(s)];
            }
            bw.write(a + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
