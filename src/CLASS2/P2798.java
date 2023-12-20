package src.CLASS2;

import java.util.ArrayList;
import java.util.Scanner;

public class P2798 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int inputMax = scanner.nextInt();
		int result = 0;
		int[] intArray = new int[inputNum];
		ArrayList<Integer> sumArray = new ArrayList<>();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < inputNum; i++) {
			for (int j = i + 1; j < inputNum; j++) {
				for (int k = j + 1; k < inputNum; k++) {
					sumArray.add(intArray[i] + intArray[j] + intArray[k]);
				}
			}
		}

		for (Integer i : sumArray) {
			if (i <= inputMax && i > result) {
				result = i;
			}
		}

		System.out.println(result);
	}
}
