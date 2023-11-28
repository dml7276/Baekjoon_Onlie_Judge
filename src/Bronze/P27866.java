package Bronze;

import java.util.Scanner;

public class P27866 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] chars = str.toCharArray();
		int i = scanner.nextInt();

		System.out.println(chars[i - 1]);
	}
}
