package src.CLASS2;

import java.util.Scanner;

public class P2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long dayTime = sc.nextInt();
		long sleepTime = sc.nextInt();
		long goals = sc.nextInt();
		long cumulativeDay;
		long currentPoint;

		cumulativeDay = (goals - sleepTime) / (dayTime - sleepTime);
		currentPoint = sleepTime + (dayTime - sleepTime) * cumulativeDay;

		if (currentPoint < goals) {
			cumulativeDay++;
		}

		System.out.println(cumulativeDay);

	}
}
