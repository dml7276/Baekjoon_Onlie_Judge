package src.CLASS2;

import java.util.ArrayList;
import java.util.Scanner;

public class P4153 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = -1, y = -1, z = -1;
		int powX, powY, powZ;
		ArrayList<String> result = new ArrayList<>();

		while (x != 0 && y != 0 && z != 0) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = scanner.nextInt();
			powX = (int)Math.pow(x, 2);
			powY = (int)Math.pow(y, 2);
			powZ = (int)Math.pow(z, 2);

			if (powX == powY + powZ || powY == powZ + powX || powZ == powX + powY){
				result.add("right");
			}
			else {
				result.add("wrong");
			}
		}

		for (int i = 0; i < result.size() - 1; i++) {
			System.out.println(result.get(i));
		}
	}
}
