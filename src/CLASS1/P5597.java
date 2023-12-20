package src.CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P5597 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < 28; i++) {
			arrayList.add(scanner.nextInt());
		}

		for (int i = 1; i <= 30; i++) {
			if (!arrayList.contains(i)){
				System.out.println(i);
			}
		}
	}
}
