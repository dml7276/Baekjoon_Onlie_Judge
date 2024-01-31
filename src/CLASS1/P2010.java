package src.CLASS1;

import java.util.Scanner;

public class P2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        int result;

        for (int j = 0; j < N; j++) {
            sum += scanner.nextInt();
        }

        result = sum - (N - 1);

        System.out.println(result);
    }
}
