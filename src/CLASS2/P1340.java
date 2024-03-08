package src.CLASS2;

import java.util.Scanner;

public class P1340 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(" ");

        // 1. 윤달인지 먼저 판단하기.
        int year = Integer.parseInt(time[2]);
        boolean yearCheck = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        // 2. 무슨 달인지 확인
        int mon = getMon(time);

        // 3. 날짜 확인
        int timeTohour = getTimeTohour(time, mon, yearCheck);

        // 6. 윤달일때 아닐때 차이
        int totalYear;
        if (yearCheck) {
            totalYear = 366 * 60 * 24;
        } else {
            totalYear = 365 * 60 * 24;
        }

        System.out.println((double) timeTohour * 100 / (double) totalYear);
    }

    private static int getMon(String[] time) {
        String month = time[0];
        return switch (month) {
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" -> 12;
            default -> 0;

        // January, February, March, April, May, June, July, August, September, October, November, December
        };
    }

    private static int getTimeTohour(String[] time, int mon, boolean yearCheck) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = Integer.parseInt(time[1].split(",")[0]);
        int dayCnt = 0;
        for (int i = 1; i < mon; i++) {
            // 3-1. 윤달이라면?
            if (yearCheck && i == 2) {
                dayCnt += 29;
                continue;
            }
            dayCnt += days[i];

        }
        dayCnt += day;

        // 4. 시간
        int hour = 60 * Integer.parseInt(time[3].split(":")[0]);
        int min = Integer.parseInt(time[3].split(":")[1]);
        int timeHM = hour + min;

        // 5. 날짜를 시간으로 환산하기.
        return 60 * 24 * (dayCnt - 1) + timeHM;
    }

}
