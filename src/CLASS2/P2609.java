package CLASS2;

import java.util.Scanner;

public class P2609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int max = num1 * num2;
		int min = Math.min(num1, num2);
		int lcm = 0, gcd = 0;

		for (int i = 1; i <= max; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}

		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}

		System.out.println(gcd);
		System.out.println(lcm);
	}
}
