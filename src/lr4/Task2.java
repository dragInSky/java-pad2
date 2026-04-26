package lr4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов: ");
            int cols = scanner.nextInt();
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Введите элемент [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.print("Введите номер столбца: ");
            int colNum = scanner.nextInt();
            if (colNum < 0 || colNum >= cols) {
                throw new IllegalArgumentException("Нет столбца с таким номером");
            }
            System.out.println("Столбец " + colNum + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][colNum]);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}