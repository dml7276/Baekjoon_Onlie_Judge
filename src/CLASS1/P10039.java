package src.CLASS1;

import java.util.Scanner;

public class P10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int a;

        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();
            if (a < 40) { a = 40; }
            result += a;
        }

        result /= 5;

        System.out.println(result);
    }
}
