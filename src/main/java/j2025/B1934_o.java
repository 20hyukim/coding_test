package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1934번 : 최소공배수
public class B1934_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        START : for (int c = 0; c < cases; c++) {
            String[] line = br.readLine().split(" ");

            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int min_mul = b/a;
            int max_mul = b;

            for (int i = min_mul; i < max_mul + 1; i++) {
                if ((a*i)%b == 0) {
                    System.out.println(a*i);
                    continue START;
                }
            }
        }
    }
}
