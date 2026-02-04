package b2026;

import java.io.*;

// 백준 11365번 : !밀비급일
public class B11365_2_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inp = br.readLine();

        while (!inp.equals("END")) {
            int len = inp.length();

            for (int i = len-1; i > -1; i--) {
                bw.write(inp.charAt(i));
            }
            bw.write("\n");
            inp = br.readLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
