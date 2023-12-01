package CLASS1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class P2920 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] origin = scanner.nextLine().split(" ");
		String[] asc  = new String[origin.length];
		String[] des  = new String[origin.length];

		System.arraycopy(origin, 0, asc, 0, origin.length);
		System.arraycopy(origin, 0, des, 0, origin.length);

		Arrays.sort(asc, Comparator.naturalOrder());
		Arrays.sort(des, Comparator.reverseOrder());

		if (Arrays.toString(asc).equals(Arrays.toString(origin))) {
			System.out.println("ascending");
		}

		if (Arrays.toString(des).equals(Arrays.toString(origin))) {
			System.out.println("descending");
		}

		if (!Arrays.toString(asc).equals(Arrays.toString(origin)) && !Arrays.toString(des).equals(Arrays.toString(origin))){
			System.out.println("mixed");
		}
	}
}
