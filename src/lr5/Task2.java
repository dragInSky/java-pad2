package lr5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] result = filterEvenNumbers(array);

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Массив четных чисел: " + Arrays.toString(result));
    }

    public static int[] filterEvenNumbers(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}
