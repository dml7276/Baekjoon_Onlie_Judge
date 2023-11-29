package Bronze;

import java.util.Scanner;

public class P2475 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int temp = scanner.nextInt();
			sum += Square(temp);
		}

		System.out.println(sum % 10);
	}

	public static int Square(int t) {
		return t * t;
	}
}
