package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15721번 : 번데기
public class B15721_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int type = Integer.parseInt(br.readLine());
        int[] calc = new int[2];


        int dup = 2;
        int count = 0;
        INIT: while (calc[type] != t) {
            for (int i = 0; i < 4; i++) {
                count ++;
                if (i % 2 == 0) {
                    calc[0] ++;
                    if (type == 0 && t == calc[type]) {
                        break INIT;
                    }
                } else {
                    calc[1] ++;
                    if (type ==1 && t == calc[type]) {
                        break INIT;
                    }
                }
            }

            for (int i = 0; i < dup; i ++) {
                count ++;
                calc[0] ++;
                if (type == 0 && t == calc[type]) {
                    break INIT;
                }
            }

            for (int i = 0; i < dup; i++) {
                count ++;
                calc[1] ++;
                if (type ==1 && t == calc[type]) {
                    break INIT;
                }
            }
            dup++;

        }

        System.out.println((count-1) % a);

    }

}
