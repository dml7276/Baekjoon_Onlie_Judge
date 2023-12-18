package src.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];

        // K: 층수, N: 호수
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int[][] floor = new int[K + 1][N];

            // 0층에 호수의 증가에 따라 1명, 2명, ..., N명 으로 초기화 작업
            for (int j = 0; j < N; j++) {
                floor[0][j] = j + 1;
            }

            for (int j = 1; j < K + 1; j++) {
                for (int k = 0; k < N; k++) {
                    for (int m = 0; m < k + 1; m++) {
                        floor[j][k] += floor[j - 1][m];
                    }
                }
            }
            result[i] = floor[K][N - 1];
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
