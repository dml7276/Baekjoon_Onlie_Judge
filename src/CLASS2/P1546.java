package src.CLASS2;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] str = scanner.nextLine().split(" ");
		int[] originScore = new int[n];
		double[] manipulationScore = new double[n];
		double sum = 0;

		for (int i = 0; i < n; i++) {
			originScore[i] = Integer.parseInt(str[i]);
		}

		int max = Arrays.stream(originScore).max().orElse(0);

		for (int i = 0; i < n; i++) {
			manipulationScore[i] = (double)originScore[i] / max * 100;
		}

		for (double d : manipulationScore) {
			sum += d;
		}

		System.out.println(sum / n);

	}
}
