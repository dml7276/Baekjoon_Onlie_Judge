package src.CLASS1;

import java.io.*;

public class P2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(Math.max(0, i)));
            sb.append(" ".repeat(Math.max(0, 2 * n - 2 * i)));
            sb.append("*".repeat(Math.max(0, i)));
            sb.append("\n");
        }

        for (int i = n - 1; i >= 1; i--) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(Math.max(0, 2 * n - 2 * i)));
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        System.out.print(sb);
    }
}