package timus.task_1493;

import java.util.Scanner;

public class Main {
    public static boolean isLucky(String s) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 3; i++) {
            sum1 += s.charAt(i) - '0';
        }

        for (int i = 3; i < 6; i++) {
            sum2 += s.charAt(i) - '0';
        }

        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();

        int num = Integer.parseInt(ticket);
        boolean answer = false;

        if (num > 0) {
            String prev = String.format("%06d", num - 1);
            if (isLucky(prev)) {
                answer = true;
            }
        }

        if (num < 999999) {
            String next = String.format("%06d", num + 1);
            if (isLucky(next)) {
                answer = true;
            }
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}