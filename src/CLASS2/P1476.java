package src.CLASS2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1476 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] split = line.split(" ");
        int E = Integer.parseInt(split[0]);
        int answer = getAnswer(split, E);

        bw.write(answer + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getAnswer(String[] split, int E) {
        int S = Integer.parseInt(split[1]);
        int M = Integer.parseInt(split[2]);

        // 0으로 초기화
        int e = 0, s = 0, m = 0;
        int answer = 0;

        do {
            // 1씩 다 증가
            e++;
            s++;
            m++;
            answer++;

            // (1 ≤ E ≤ 15, 1 ≤ M ≤ 19, 1 ≤ S ≤ 28)
            // 범위를 넘겼으면 1로 초기화
            if (e > 15) e = 1;
            if (s > 28) s = 1;
            if (m > 19) m = 1;

            // 그 후 검증
        } while (e != E || s != S || m != M);
        return answer;
    }
}
