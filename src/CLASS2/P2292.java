package src.CLASS2;

import java.util.Scanner;

public class P2292 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		long para = 6;
		long init = 2;
		long next = 8;
		long count;

		if (num == 1) {
			count = 1;
			System.out.println(count);
		} else {
			count = 2;
			for (long i = 2; i <= num; i++) {
				if (i == next) {
					count++;
					next = next + para * init;
					init++;
				}
			}
			System.out.println(count);
		}
	}
}
