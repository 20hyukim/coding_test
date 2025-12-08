package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

// 백준 18258번 : 큐2
public class B18258_x {
    public static void main(String[] args) throws IOException {
        // 큐큐큐큐큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        Deque<Integer> deque = new ArrayDeque<>();

        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i ++) {
            String line = br.readLine();
            String[] inp = br.readLine().split(" ");

            if (Objects.equals(inp[0], "push")) {
                deque.addLast(Integer.parseInt(inp[1]));
            }
            else if (Objects.equals(inp[0], "pop")) {
                pw.println(deque.isEmpty() ? -1 : deque.removeFirst());
            }
            else if (Objects.equals(inp[0], "size")) {
                pw.println(deque.size());
            }
            else if (Objects.equals(inp[0], "empty")) {
                pw.println(deque.isEmpty()? 1: 0);
            }
            else if (Objects.equals(inp[0], "front")) {
                pw.println(deque.isEmpty()? -1: deque.peekFirst());
            }
            else {
                pw.println(deque.isEmpty()? -1: deque.peekLast());
            }
        }

        pw.flush();
        br.close();
        pw.close();
    }
}
