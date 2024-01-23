package src.CLASS1;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        StringBuilder tempA = new StringBuilder();
        StringBuilder tempB = new StringBuilder();
        int resultA;
        int resultB;

        for (int i = A.length() - 1; i >= 0; i--) {
            tempA.append(A.charAt(i));
        }

        for (int i = B.length() - 1; i >= 0; i--) {
            tempB.append(B.charAt(i));
        }

        resultA = Integer.parseInt(tempA.toString());
        resultB = Integer.parseInt(tempB.toString());

        System.out.println(Math.max(resultA, resultB));
    }
}
