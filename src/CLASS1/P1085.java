package src.CLASS1;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int result1 = Math.min((w - x), (h - y));
        int result2 = Math.min(x, y);
        int result3 = Math.min(result1, result2);

        System.out.println(result3);
    }
}
