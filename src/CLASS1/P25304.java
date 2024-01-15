package src.CLASS1;

import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int kind = scanner.nextInt();
        int calMoney = 0;

        for (int i = 0; i < kind; i++) {
            int price = scanner.nextInt();
            int number = scanner.nextInt();
            calMoney += price * number;
        }

        if (calMoney == money) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
