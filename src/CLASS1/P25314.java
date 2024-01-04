package src.CLASS1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(inputReader.readLine());
        int conut = (N / 4) - 1;

        String result = "long " +
                "long ".repeat(Math.max(0, conut)) +
                "int";

        System.out.println(result);
    }
}
