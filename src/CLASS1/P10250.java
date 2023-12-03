package CLASS1;

import java.util.Scanner;

public class P10250 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		int height, width, order;
		int lastHeight = 0, lastWidth = 0;

		for (int i = 0; i < test; i++) {
			height = scanner.nextInt();
			width = scanner.nextInt();
			order = scanner.nextInt();
			int firstOrder = 0;

			for (int j = 1; j <= width; j++) {
				for (int m = 1; m <= height; m++) {
					firstOrder++;
					if (order == firstOrder) {
						lastWidth = j;
						lastHeight = m;
						break;
					}
				}
			}
			System.out.println(lastHeight + String.format("%02d",lastWidth));
		}
	}
}
