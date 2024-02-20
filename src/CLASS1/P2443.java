package src.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(Math.max(0, 2 * (n - i) - 1)));
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
