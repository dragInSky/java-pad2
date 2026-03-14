package timus.task_1110;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        int n = id.nextInt();
        int m = id.nextInt();
        int y = id.nextInt();

        boolean check = false;

        for (int x = 0; x < m; x++) {
            int result = 1;

            for (int i = 0; i < n; i++) {
                result = result * x % m;
            }

            if (result == y) {
                if (check) {
                    System.out.print(" ");
                }
                System.out.print(x);
                check = true;
            }
        }

        if (!check) {
            System.out.println(-1);
        }
    }
}