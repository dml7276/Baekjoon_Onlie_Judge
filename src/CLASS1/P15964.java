package CLASS1;

import java.util.Scanner;

public class P15964 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long a = scanner.nextLong();
		long b = scanner.nextLong();

		System.out.println(NewOperation(a, b));
	}

	public static long NewOperation(long A, long B) {
		return (A + B) * (A - B);
	}
}
