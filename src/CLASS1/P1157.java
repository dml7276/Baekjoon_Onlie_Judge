package CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] cnt = new int[26];
		ArrayList<Integer> integers = new ArrayList<>();
		int cnt2 = 0;
		int max = -1;
		boolean overlap = false;
		char temp;
		String str = scanner.nextLine().toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			cnt[temp - 65]++;
		}

		for (Integer i : cnt) {
			integers.add(i);
			if (max < i) {
				max = i;
			}
		}

		for (Integer i : cnt) {
			if (max == i) {
				cnt2++;
			}

			if (cnt2 > 1) {
				overlap = true;
			}
		}

		if (!overlap) {
			char result = (char)(integers.indexOf(max) + 65);
			System.out.println(result);
		}
		else {
			System.out.println("?");
		}
	}
}
