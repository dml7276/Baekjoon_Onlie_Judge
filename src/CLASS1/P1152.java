
package src.CLASS1;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine().strip();
        String[] array = ex.split(" ");

        if(!ex.isEmpty()) {
            System.out.print(array.length);
        }
        else {
            System.out.print(0);
        }
    }
}
