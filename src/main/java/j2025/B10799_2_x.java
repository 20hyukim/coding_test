package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10799_2_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inps = br.readLine();

        inps = inps.replace("()", "R");

        int inps_len = inps.length();
        int cnt = 0 ;
        int sticks = 0;
        for (int i = 0; i < inps_len; i++) {
            if (inps.charAt(i) == 'R') {
                cnt += sticks;
                continue;
            }

            if (inps.charAt(i) == '(') {
                sticks ++;
                continue;
            }

            if (inps.charAt(i) == ')') {
                cnt ++;
                sticks --;
            }

        }

        System.out.println(cnt);

    }
}
