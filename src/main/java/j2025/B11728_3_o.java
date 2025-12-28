package j2025;

import java.io.*;

// 백준 11728번 : 배열 합치기
public class B11728_3_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inps = br.readLine().split(" ");
        int idx1 = Integer.parseInt(inps[0]);
        int idx2 = Integer.parseInt(inps[1]);

        int cur_idx1 = 0;
        int cur_idx2 = 0;

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        while (cur_idx1 < idx1 && cur_idx2 < idx2) {
            if (Integer.parseInt(arr1[cur_idx1]) < Integer.parseInt(arr2[cur_idx2])) {
                bw.write(arr1[cur_idx1++] + " ");
                continue;
            }
            bw.write(arr2[cur_idx2++] + " ");
        }

        while (cur_idx1 < idx1) {
            bw.write(arr1[cur_idx1++] + " ");
        }

        while (cur_idx2 < idx2) {
            bw.write(arr2[cur_idx2++] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
