package CLASS2;

import java.util.Scanner;

public class P2231 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		int sum;
		int result = 0;

		for (int i = 0; i <= num; i++) {
			int digitSum = 0;
			String[] str = String.valueOf(i).split("");

			for (String s : str) {
				digitSum += Integer.parseInt(s);
			}
			sum = i + digitSum;

			if (sum == num) {
				count++;
				result = i;
				break;
			}
		}

		if (count != 0) {
			System.out.println(result);
		} else {
			System.out.println(0);
		}
	}
}
