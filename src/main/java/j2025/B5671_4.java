package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 5671번 : 호텔 방 번호
public class B5671_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        while (line != null && !line.isEmpty()) {
            String[] inps = line.split(" ");
            int n = Integer.parseInt(inps[0]);
            int m = Integer.parseInt(inps[1]);

            int cnt = 0;
            for (int i = n ; i < m + 1; i++) {
                if (!sameNum(i)) cnt++;
            }

            System.out.println(cnt);

            line = br.readLine();
        }

    }

    private static boolean sameNum(int roomNumber) {
        boolean[] dup = new boolean[10];

        String sRoomNumber = String.valueOf(roomNumber);
        for (char c : sRoomNumber.toCharArray()) {
            int iNumber = Integer.parseInt(String.valueOf(c)); //

            if (!dup[iNumber]) {
                dup[iNumber] = true;
                continue;
            }
            return true;
        }
        return false;
    }

}
