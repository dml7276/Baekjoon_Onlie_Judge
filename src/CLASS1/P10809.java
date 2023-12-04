package CLASS1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P10809 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] alphaIndex = new int[26];
		Arrays.fill(alphaIndex, -1);
		String string = scanner.next();
		ArrayList<Character> ascii = new ArrayList<>();

		for (int i = 0; i < string.length(); i++) {
			ascii.add(string.charAt(i));
		}

		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if ((int)ascii.get(i) == j + 97) {
					alphaIndex[j] = ascii.indexOf(ascii.get(i));
					break;
				}
			}
		}

		for (Integer i : alphaIndex) {
			System.out.print(i + " ");
		}

	}
}
