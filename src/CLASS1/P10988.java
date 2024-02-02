package src.CLASS1;

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.next();
        int textLength = inputText.length();
        int halfLength = textLength / 2;
        int result = 1;

        for (int i = 0; i < halfLength; i++) {
            if (inputText.charAt(i) != inputText.charAt(textLength - 1 - i)) {
                result = 0;
                break;
            }
        }

        System.out.println(result);

    }
}
