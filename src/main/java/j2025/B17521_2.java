package j2025;

import java.io.*;

// 백준 17521번 : Byte Coin
public class B17521_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        long money = Integer.parseInt(inp[1]);
        long coin = 0;

        int[] coinValues = new int[n+1];

        for (int i = 0; i < n; i++) {
            coinValues[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            if (coinValues[i] < coinValues[i+1]) {
                coin += money / coinValues[i];
                money = money % coinValues[i];
                continue;
            }
            money += coin * coinValues[i];
            coin = 0;
        }


        bw.write(money +"");
        bw.flush();

        bw.close();
        br.close();
    }
}
