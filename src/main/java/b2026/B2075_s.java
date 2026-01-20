package b2026;

import java.io.*;
import java.util.PriorityQueue;

// 백준 2075번 : N번째 큰 수
public class B2075_s {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            for (String num : nums) {
                int ni = Integer.parseInt(num);

                if (queue.size() != n) {
                    queue.add(ni);
                    continue;
                }

                if (ni > queue.peek()) {
                    queue.poll();
                    queue.add(ni);
                }
            }
        }

        System.out.println(queue.peek() + "");
    }
}
