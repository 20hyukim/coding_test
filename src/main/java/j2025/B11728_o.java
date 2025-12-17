package j2025;

import java.io.*;
import java.util.PriorityQueue;

// 백준 11728번 : 배열 합치기
public class B11728_o {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        String[] ab = br.readLine().split(" ");

        for(String n: ab) {
            String[] nums = br.readLine().split(" ");
            for (int i = 0; i < Integer.parseInt(n); i++) {
                queue.add(Integer.parseInt(nums[i]));
            }

        }

        while (!queue.isEmpty()) {
            Integer n = queue.poll();
            bw.write(n+ " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
