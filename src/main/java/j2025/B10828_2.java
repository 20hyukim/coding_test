package j2025;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

// 백준 10828번 : 스택
public class B10828_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> stack = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] inp = br.readLine().split(" ");

            if (inp[0].equals("push")) {
                stack.addFirst(inp[1]);
                continue;
            }
            if (inp[0].equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(stack.getFirst());
                }
                bw.write("\n");
                continue;
            }
            if (inp[0].equals("size")) {
                bw.write(stack.size() + "\n");
                continue;
            }
            if (inp[0].equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1");
                } else{
                    bw.write("0");
                }
                bw.write("\n");
                continue;
            }

            if (stack.isEmpty()) {
                bw.write("-1");
            } else{
                bw.write(stack.removeFirst());
            }
            bw.write("\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
