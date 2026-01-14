package b2026;

import java.io.*;

// 백준 1717번 : 집합의 표현
public class B1717_o {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        parent = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            String[] inp = br.readLine().split(" ");
            int a = getParent(Integer.parseInt(inp[1]));
            int b = getParent(Integer.parseInt(inp[2]));

            if (inp[0].equals("0")) {
                if (a != b) setParent(a, b);
                continue;
            }

            if (a==b) {
                bw.write("yes"+"\n");
            } else{
                bw.write("no"+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getParent(int a) {
        if (a != parent[a]) parent[a] = getParent(parent[a]);
        return parent[a];
    }

    private static void setParent(int a, int b) {
        parent[a] = b;
    }
}
