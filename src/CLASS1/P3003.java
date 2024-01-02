package src.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //  킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        String[] inputDatas = bufferedReader.readLine().split(" ");
        int[] chessPieces = new int[inputDatas.length];
        int[] originPieces = {1, 1, 2, 2, 2, 8};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chessPieces.length; i++) {
            chessPieces[i] = Integer.parseInt(inputDatas[i]);
        }

        for (int i = 0; i < chessPieces.length; i++) {
            result.append(originPieces[i] - chessPieces[i]).append(" ");
        }

        System.out.println(result);
    }
}
