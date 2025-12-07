package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 백준 10815번 : 숫자 카드
public class B10815_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        String[] n_nums = br.readLine().split(" ");

        String m = br.readLine();
        String[] m_nums = br.readLine().split(" ");

        for (String num : n_nums) {
            set.add(num);
        }

        for (String num : m_nums) {
            if (set.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);

    }

}
