package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == 'a' || c == 'd' || c == 'g' || c == 'j' ||
                    c == 'm' || c == 'p' || c == 's' || c == 'v' ||
                    c == 'y' || c == '.' || c == ' ') {
                sum += 1;
            } else if (c == 'b' || c == 'e' || c == 'h' || c == 'k' ||
                    c == 'n' || c == 'q' || c == 't' || c == 'w' ||
                    c == 'z' || c == ',') {
                sum += 2;
            } else if (c == 'c' || c == 'f' || c == 'i' || c == 'l' ||
                    c == 'o' || c == 'r' || c == 'u' || c == 'x' ||
                    c == '!') {
                sum += 3;
            }
        }

        System.out.println(sum);
    }
}