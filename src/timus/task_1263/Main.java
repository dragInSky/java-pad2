package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            int candidate = sc.nextInt();
            votes[candidate - 1]++;
        }

        for (int i = 0; i < n; i++) {
            double percent = (double) votes[i] * 100 / m;
            System.out.printf("%.2f%%\n", percent);
        }
    }
}