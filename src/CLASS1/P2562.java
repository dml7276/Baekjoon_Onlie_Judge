package CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < 9; i++) {
			arrayList.add(scanner.nextInt());
		}

		for (int i = 0; i < 9; i++) {
			if (max < arrayList.get(i)) {
				max = arrayList.get(i);
			}
		}

		System.out.println(max);
		System.out.println(arrayList.indexOf(max) + 1);
	}
}
