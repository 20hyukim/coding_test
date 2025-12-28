package j2025;

import java.io.*;

// 백준 11659번 : 구간 합 구하기 4
public class B11659_2_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lc = br.readLine().split(" ");

        int l = Integer.parseInt(lc[0]);
        int c = Integer.parseInt(lc[1]);

        int[] c_arr = new int[l+1];
        String[] line = br.readLine().split(" ");

        for (int i = 1; i < l+1; i++) {
            c_arr[i] = Integer.parseInt(line[i-1]) + c_arr[i-1];
        }

        for (int i = 0; i < c; i++) {
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);
            bw.write(c_arr[e] - c_arr[s-1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
