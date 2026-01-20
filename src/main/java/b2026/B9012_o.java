package b2026;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

// 백준 9012번 : 괄호
public class B9012_o {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] request = br.readLine().split("");
            if (!getValid(request)) {
                bw.write("NO" + "\n");
                continue;
            }

            bw.write("YES" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean getValid(String[] request) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(String r : request) {
            if (r.equals("(")) {
                queue.addLast(1);
                continue;
            }

            if (queue.isEmpty()) return false;
            queue.removeLast();
        }

        return queue.isEmpty();
    }
}
