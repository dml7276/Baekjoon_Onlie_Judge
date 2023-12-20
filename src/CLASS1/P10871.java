package src.CLASS1;

import java.util.Scanner;
public class P10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] temp = new int[n];

		for (int i = 0; i < n; i++) {
			temp[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (x > temp[i]) {
				System.out.print(temp[i] + " ");
			}
		}
	}
}
