package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 백준 9375번 : 패션왕 신해빈
public class B9375_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            System.out.println(getStyles(br));
        }
    }

    private static int getStyles(BufferedReader br) throws IOException{
        Map<String, Integer> map = new HashMap<>();
        int styles = Integer.parseInt(br.readLine());
        for (int i = 0; i < styles; i++) {
            String[] details = br.readLine().split(" ");
            if (map.containsKey(details[1])) {
                map.put(details[1], map.get(details[1])+1);
            } else {
                map.put(details[1], 1);
            }
        }

        int cal = 1;
        for (String key : map.keySet()) {
            cal *= (map.get(key)+1);
        }

        return cal-1;
    }
}
