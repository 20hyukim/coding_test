package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2435번: 기상청 인턴 신현수
public class B2435_2_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inps = br.readLine().split(" ");
        int n = Integer.parseInt(inps[0]);
        int seq = Integer.parseInt(inps[1]);

        String[] nums = br.readLine().split(" ");
        int[] i_nums = new int[n];

        for (int i = 0; i < n; i++) {
            i_nums[i] = Integer.parseInt(nums[i]);
        }

        int s_idx = 0;
        int e_idx = seq;
        int value = 0;
        for (int i = 0; i < seq; i++) {
            value += i_nums[i];
        }
        int max_value = value;

        for (int i = 0; i < n-seq; i++) {
            value -= i_nums[s_idx];
            value += i_nums[e_idx];
            max_value = Math.max(value, max_value);
            s_idx++;
            e_idx++;
        }

        System.out.println(max_value);
    }
}
