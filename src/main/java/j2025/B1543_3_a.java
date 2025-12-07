package j2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1543_3_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();
        String has = br.readLine();

        int init_len = sentence.length();

        sentence = sentence.replaceAll(has, "");
        int post_len = sentence.length();

        System.out.println((init_len - post_len)/has.length());

    }
}
