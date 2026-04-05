package timus.task_1313;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int s = 0; s <= 2 * n - 2; s++) {
            int rowStart = Math.min(n - 1, s);
            int rowEnd = Math.max(0, s - (n - 1));

            for (int i = rowStart; i >= rowEnd; i--) {
                int j = s - i;
                sb.append(a[i][j]).append(' ');
            }
        }

        System.out.println(sb.toString().trim());
    }
}