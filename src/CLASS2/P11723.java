package src.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = 0;
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("all")) S = (1 << 21) - 1;
            else if (str.equals("empty")) S = 0;
            else {
                int num = Integer.parseInt(st.nextToken());
                switch (str) {
                    case "add" -> S |= (1 << num);
                    case "remove" -> S &= ~(1 << num);
                    case "check" -> sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n");
                    case "toggle" -> S ^= (1 << num);
                }
            }
        }

        System.out.println(sb);
    }
}
