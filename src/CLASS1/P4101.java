package src.CLASS1;

import java.util.Scanner;

public class P4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;


        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }

            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
