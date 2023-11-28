package Bronze;

import java.util.Scanner;

public class P2744 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] charArray = scanner.nextLine().toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isUpperCase(charArray[i])) {
				charArray[i] = Character.toLowerCase(charArray[i]);
			}
			else {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		for (char ch : charArray){
			System.out.print(ch);
		}
	}
}
