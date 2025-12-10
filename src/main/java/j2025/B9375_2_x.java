package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 백준 9375번 : 패션왕 신해빈
public class B9375_2_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cases; i++) {
            System.out.println(getStyleCnt(br, map));
        }
    }

    public static int getStyleCnt(BufferedReader br, HashMap<String, Integer> map) throws IOException {
        int styles = Integer.parseInt(br.readLine());

        for (int i = 0; i < styles; i++) {
            String[] details = br.readLine().split(" ");
            int value = map.getOrDefault(details[1], 0);
            map.put(details[1], value+1);
        }

        int result = 1;
        for (String key : map.keySet()) {
            result *= (map.get(key) + 1);
        }
        map.clear();
        return result-1;
    }
}
