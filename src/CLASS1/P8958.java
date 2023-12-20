package src.CLASS1;

import java.util.Scanner;

public class P8958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		int[] result = new int[test];

		for (int i = 0; i < test; i++) {
			String[] strings = scanner.next().split("");
			int count = 0;
			int score = 0;

			for (String s : strings) {
				if (s.equals("O")) {
					count++;
					score += count;
				}
				else {
					count = 0;
				}
			}
			result[i] = score;
		}

		for (Integer i : result) {
			System.out.println(i);
		}
	}
}
