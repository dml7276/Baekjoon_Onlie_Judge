package src.CLASS1;

import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int plusHour = C / 60;
        int plusMinute = C % 60;

        int resultMinute = B + plusMinute;

        if (resultMinute >= 60) {
            plusHour += resultMinute / 60;
            resultMinute %= 60;
        }

        int resultHour = A + plusHour;

        if (resultHour >= 24) {
            resultHour %= 24;
        }

        System.out.println(resultHour + " " + resultMinute);
    }
}
