package src.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(bufferedReader.readLine());
        String[] inputDatas = new String[caseCount];
        StringBuilder result = new StringBuilder();
        int PSCount = 0;

        for (int i = 0; i < caseCount; i++) {
            inputDatas[i] = bufferedReader.readLine();
        }

        for (String data : inputDatas) {
            for (int i = 0; i < data.length(); i++) {
                if (PSCount < 0) {
                    break;
                }

                if (data.charAt(i) == '(') {
                    PSCount++;
                } else if (data.charAt(i) == ')') {
                    PSCount--;
                }
            }
            if (PSCount == 0) {
                result.append("YES").append("\n");
            } else {
                result.append("NO").append("\n");
            }
            PSCount = 0;
        }

        System.out.println(result);
    }
}
