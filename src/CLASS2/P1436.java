package CLASS2;

import java.util.Scanner;

public class P1436 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int countN = 0;
		int result = 0;
		int i = 0;

		while (countN != n) {
			i++;
			String str = String.valueOf(i);

			if (str.contains("666")) {
				countN++;
			}

			if (countN == n) {
				result = i;
			}
		}
		System.out.println(result);
	}
}
