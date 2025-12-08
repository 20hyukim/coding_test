package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 17521번 : Byte Coin
public class B17521_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long money = Long.parseLong(st.nextToken());
        long coin = 0;

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            if (price[i+1] > price[i]) {
                long buy = money / price[i];
                coin += buy;
                money -= buy * price[i];
            } else if (price[i+1] < price[i]) {
                money += coin * price[i];
                coin = 0;
            }
        }

        // 최소 때, 매수를 해놨으니까 price[n-1] 이거 해도..? 최대 아니면 어짜피 coin (0) * price[n-1]
        money += coin * price[n-1];

        System.out.println(money);
    }
}
