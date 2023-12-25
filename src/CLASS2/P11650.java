package src.CLASS2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] coordinates = new String[n];

        for (int i = 0; i < n; i++) {
            coordinates[i] = bufferedReader.readLine();
        }

        Arrays.sort(coordinates, (String o1, String o2) -> {
            String[] temp1 = o1.split(" ");
            String[] temp2 = o2.split(" ");

            int currentX = Integer.parseInt(temp1[0]);
            int nextX = Integer.parseInt(temp2[0]);
            int currentY = Integer.parseInt(temp1[1]);
            int nextY = Integer.parseInt(temp2[1]);

            if (currentX > nextX) {
                return 1;
            } else if (currentX == nextX) {
                if (currentY > nextY) {
                    return 1;
                } else return -1;
            } else {
                return -1;
            }
        });

        for (String string : coordinates) {
            stb.append(string).append("\n");
        }

        System.out.println(stb);
    }
}
