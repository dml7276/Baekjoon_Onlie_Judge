package src.CLASS1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		int copy = N;

		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
		} while (copy != N);

		System.out.println(count);
	}
}
