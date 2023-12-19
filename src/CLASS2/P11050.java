package src.CLASS2;

import java.util.Scanner;

public class P11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int result = binoCoefFactorial(N, K);

        System.out.println(result);
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i < n + 1; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int binoCoefFactorial(int n, int k) {
        return factorial(n) / (factorial(n - k) * factorial(k));
    }
}
