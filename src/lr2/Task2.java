package lr2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = id.nextInt();
        System.out.println("Введите количество столбцов:");
        int cols = id.nextInt();

        int[][] matrix = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = value++;
                }
            }
        }

        System.out.println("Матрица-змейка:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
