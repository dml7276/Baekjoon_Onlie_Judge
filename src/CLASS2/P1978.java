package src.CLASS2;

import java.util.Scanner;

public class P1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		int count = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= num[i]; j++) {
				if (num[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				result++;
			}
			count = 0;
		}
		System.out.println(result);
	}
}
