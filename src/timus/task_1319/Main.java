package timus.task_1319;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int x = 1;

        for (int d = n - 1; d >= -(n - 1); d--) {
            for (int i = 0; i < n; i++) {
                int j = i + d;
                if (j >= 0 && j < n) {
                    a[i][j] = x++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}