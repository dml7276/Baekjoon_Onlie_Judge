package CLASS1;

import java.util.Scanner;

public class P2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings;
		int[] cnt = new int[10];
		int sum = 1;

		for (int i = 0; i < 3; i++) {
			sum *= scanner.nextInt();
		}

		strings = String.valueOf(sum).split("");

		for (String s : strings) {
			switch (s) {
				case "0":
					cnt[0]++;
					break;
				case "1":
					cnt[1]++;
					break;
				case "2":
					cnt[2]++;
					break;
				case "3":
					cnt[3]++;
					break;
				case "4":
					cnt[4]++;
					break;
				case "5":
					cnt[5]++;
					break;
				case "6":
					cnt[6]++;
					break;
				case "7":
					cnt[7]++;
					break;
				case "8":
					cnt[8]++;
					break;
				case "9":
					cnt[9]++;
					break;
			}
		}

		for (Integer i : cnt) {
			System.out.println(i);
		}
	}
}
