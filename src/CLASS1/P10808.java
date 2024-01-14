package src.CLASS1;

import java.util.Scanner;

public class P10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[(int) str.charAt(i) - 97] += 1;
        }

        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
