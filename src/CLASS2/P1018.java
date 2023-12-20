package src.CLASS2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1018 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int count1 = 0, count2 = 0;
		ArrayList<Integer> minCount = new ArrayList<>();
		String[] strTemp = new String[width];
		String[][] correct1 = new String[][] {{"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"},
			{"B", "W", "B", "W", "B", "W", "B", "W"}};
		String[][] correct2 = new String[][] {{"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"},
			{"W", "B", "W", "B", "W", "B", "W", "B"}};

		char[][] chess = new char[8][8];
		for (int i = 0; i < strTemp.length; i++) {
			strTemp[i] = scanner.next();
		}

		for (int i = 0; i <= width - 8; i++) {
			for (int j = 0; j <= height - 8; j++) {
				for (int l = i; l < i + 8; l++) {
					for (int s = j; s < j + 8; s++) {
						chess[l - i][s - j] = strTemp[l].charAt(s);
					}
				}

				for (int k = 0; k < 8; k++) {
					for (int m = 0; m < 8; m++) {
						if (!String.valueOf(chess[k][m]).equals(correct1[k][m])) {
							count1++;
						}
					}
				}

				for (int k = 0; k < 8; k++) {
					for (int m = 0; m < 8; m++) {
						if (!String.valueOf(chess[k][m]).equals(correct2[k][m])) {
							count2++;
						}
					}
				}

				minCount.add(count1);
				minCount.add(count2);
				count1 = 0;
				count2 = 0;

			}
		}
		int min = Collections.min(minCount);
		System.out.println(min);
	}
}
