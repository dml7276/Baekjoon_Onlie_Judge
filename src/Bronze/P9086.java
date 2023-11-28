package Bronze;

import java.util.Scanner;

public class P9086 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		for (int i = 0; i < test; i++) {
			String string = scanner.next();
			System.out.print(string.charAt(0));
			System.out.println(string.charAt(string.length() - 1));
		}
	}
}
