package Bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class P10952 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<>();

		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a + b == 0) {
				break;
			}
			integers.add(a + b);
		}

		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}
}
