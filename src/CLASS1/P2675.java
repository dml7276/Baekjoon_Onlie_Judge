package CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		ArrayList<String> arrayList = new ArrayList<>();

		for (int i = 0; i < test; i++) {
			int re = scanner.nextInt();
			String[] temp = scanner.next().split("");
			StringBuilder stringBuilder = new StringBuilder();

			for (String string : temp) {
				stringBuilder.append(string.repeat(re));
			}

			arrayList.add(String.valueOf(stringBuilder));
		}

		for (String result : arrayList) {
			System.out.println(result);
		}
	}
}
