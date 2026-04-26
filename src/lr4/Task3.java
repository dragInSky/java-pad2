package lr4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            byte[] array = new byte[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextByte();
                sum += array[i];
            }
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Сумма выходит за границы диапазона типа byte");
            }
            System.out.println("Сумма элементов: " + sum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа или число вне диапазона byte");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}