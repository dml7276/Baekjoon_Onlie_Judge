package CLASS1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayInt = new ArrayList<>();
		ArrayList<Integer> arrayRest = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arrayInt.add(scanner.nextInt());
		}

		for (Integer integer : arrayInt) {
			arrayRest.add(integer % 42);
		}

		Set<Integer> integerSet = new HashSet<>(arrayRest);
		System.out.println(integerSet.size());
	}
}
