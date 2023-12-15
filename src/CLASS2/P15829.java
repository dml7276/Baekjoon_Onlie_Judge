package CLASS2;

import java.math.BigInteger;
import java.util.Scanner;

public class P15829 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger r = new BigInteger("31");
		BigInteger mod = new BigInteger("1234567891");
		BigInteger hashValue = new BigInteger("0");
		int n = scanner.nextInt();
		String str = scanner.next();
		char[] arr = str.toCharArray();

		for (int i = 0; i < n; i++) {
			BigInteger a = BigInteger.valueOf((byte)arr[i] - 96);
			hashValue = hashValue.add(a.multiply(r.pow(i)).remainder(mod));
		}

		hashValue = hashValue.remainder(mod);
		System.out.println(hashValue);
	}
}
