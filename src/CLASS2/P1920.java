package src.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrayA = new int[N];

        StringBuilder stb = new StringBuilder();

        String[] tempA = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrayA[i] = Integer.parseInt(tempA[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrayB = new int[M];

        String[] tempB = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            arrayB[i] = Integer.parseInt(tempB[i]);
        }

        Arrays.sort(arrayA);
        for (int n : arrayB) {
            if (BSearch(arrayA, n)) stb.append(1).append("\n");
            else stb.append(0).append("\n");
        }

        System.out.println(stb);
    }

    public static boolean BSearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return true;
        }
        return false;
    }
}


