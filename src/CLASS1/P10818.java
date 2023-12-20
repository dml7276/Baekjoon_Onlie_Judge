package src.CLASS1;

import java.util.Arrays;
import java.util.Scanner;

public class P10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] intArray = new int[n];

		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}

		int max = Arrays.stream(intArray).max().orElse(0);
		int min = Arrays.stream(intArray).min().orElse(0);

		System.out.println(min + " " + max);
	}
}
