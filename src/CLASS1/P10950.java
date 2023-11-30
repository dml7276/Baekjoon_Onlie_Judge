package CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		ArrayList<Integer> integers = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			integers.add(scanner.nextInt() + scanner.nextInt());
		}

		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}
}
