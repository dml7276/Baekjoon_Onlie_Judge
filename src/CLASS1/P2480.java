package src.CLASS1;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int reward;

        if (b == c && a == c) {
            reward = 10000 + a * 1000;
        } else if (a == b || b == c || a == c) {
            if (a == b) {
                reward = 1000 + a * 100;
            } else if (a == c) {
                reward = 1000 + a * 100;
            } else {
                reward = 1000 + b * 100;
            }
        } else {
            if (a > b && a > c) {
                reward = a * 100;
            } else if (b > a && b > c) {
                reward = b * 100;
            } else {
                reward = c * 100;
            }
        }

        System.out.println(reward);
    }
}
