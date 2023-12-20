package src.CLASS1;

import java.util.ArrayList;
import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String[] str;
		str = scanner.next().split("");
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (String string : str) {
			arrayList.add(Integer.parseInt(string));
		}

		for (Integer integer : arrayList) {
			sum += integer;
		}

		System.out.println(sum);
	}
}
