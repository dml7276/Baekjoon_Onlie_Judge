package src.CLASS2;

import java.util.ArrayList;
import java.util.Scanner;

public class P1380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scene_num = 1;    //시나리오 번호

        while (true) {

            String n = sc.nextLine();    //귀걸이를 압수당한 여학생의 수
            int n1 = Integer.parseInt(n);
            if (n1 == 0) break;

            String[] name = new String[n1];    //여학생들의 이름을 저장할 String 배열
            for (int i = 0; i < n1; i++) {
                name[i] = sc.nextLine();
            }

            ArrayList<String> k = new ArrayList<>();    // 여학생 번호를 입력받을 ArrayList.

            for (int i = 0; i < 2 * n1 - 1; i++) {
                String num = sc.next();
                if (k.contains(num))    // 해당 번호가 두 번째로 등장하면 돌려받는 것이기 때문에 해당 번호가 ArrayList에 포함되어 있으면 제거.
                    k.remove(num);
                else
                    k.add(num);

                sc.nextLine();
            }
            int tmp = Integer.parseInt(k.getFirst()) - 1;    //ArrayList에 남아있는 번호는 귀걸이를 돌려받지 못한 여학생의 리스트 번호이다.
            System.out.println(scene_num + " " + name[tmp]);
            scene_num++;

        }
        sc.close();

    }

}
