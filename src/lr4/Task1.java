package lr4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            }
            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}