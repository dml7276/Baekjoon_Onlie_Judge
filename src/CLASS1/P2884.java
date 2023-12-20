package src.CLASS1;

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();

		if (m >= 45) {
			m = m - 45;
		}
		else {
			h--;
			m = 15 + m;
		}

		if (h == -1) {
			h = 23;
		}

		System.out.println(h + " " + m);
	}
}
