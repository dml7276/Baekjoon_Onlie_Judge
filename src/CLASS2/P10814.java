package src.CLASS2;

import java.util.*;

public class P10814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stb = new StringBuilder();
        Member[] members = new Member[n];
        
        for (int i = 0; i < n; i++) {
            members[i] = new Member();
            members[i].age = scanner.nextInt();
            members[i].name = scanner.next();
        }

        Arrays.sort(members, Comparator.comparingInt(o -> o.age));

        for (int i = 0; i < n; i++) {
            stb.append(members[i].age).append(" ").append(members[i].name).append("\n");
        }

        System.out.println(stb);

    }

    static class Member {
        int age;
        String name;
    }
}