package src.CLASS1;

import java.util.Scanner;

public class P11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = scanner.nextInt();
        int[] intArrayA = new int[caseCount];
        int[] intArrayB = new int[caseCount];

        for (int i = 0; i < caseCount; i++) {
            intArrayA[i] = scanner.nextInt();
            intArrayB[i] = scanner.nextInt();
        }

        for (int i = 0; i < caseCount; i++) {
            System.out.println("Case #" + (i + 1) + ": " + intArrayA[i] + " + " + intArrayB[i] + " = " + (intArrayA[i] + intArrayB[i]));
        }


    }
}
