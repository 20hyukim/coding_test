package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

// 백준 1622번 : 공통 순열
public class B1622_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        TreeMap<Character, Integer> fMap = new TreeMap<>();
        TreeMap<Character, Integer> sMap = new TreeMap<>();

        while (first != null) {

            String result = "";
            for (char c : first.toCharArray()) {
                fMap.put(c, fMap.getOrDefault(c, 0) + 1);
            }

            for (char c : second.toCharArray()) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            }

            for (Character c : fMap.keySet()) {
                if (sMap.containsKey(c)) {
                    int max_dup = Math.min(fMap.get(c), sMap.get(c));
                    result += Character.toString(c).repeat(max_dup);
                }
            }

            System.out.println(result);
            fMap.clear();
            sMap.clear();
            first = br.readLine();
            second = br.readLine();

        }
    }
}
