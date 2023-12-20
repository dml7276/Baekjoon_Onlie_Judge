package src.CLASS2;

import java.util.ArrayList;
import java.util.Scanner;

public class P1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int mid;
		int last;
		String temp;
		String[] strings;
		ArrayList<String> resultArray = new ArrayList<>();

		while (num != 0) {
			String result = "yes";
			num = sc.nextInt();
			temp = String.valueOf(num);
			last = temp.length() - 1;
			mid = temp.length() / 2;
			strings = temp.split("");

			for (int i = 0; i < mid; i++) {
				if (!strings[i].equals(strings[last - i])) {
					result = "no";
					break;
				}
			}
			if (num != 0) {
				resultArray.add(result);
			}
		}

		for (String s : resultArray) {
			System.out.println(s);
		}
	}
}
