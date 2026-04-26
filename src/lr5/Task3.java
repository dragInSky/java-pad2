package lr5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Введите элемент первого массива " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Введите размер второго массива: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Введите элемент второго массива " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] result = findCommonElements(array1, array2);

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        System.out.println("Общие элементы: " + Arrays.toString(result));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        return Arrays.stream(array1)
                .filter(x -> Arrays.stream(array2).anyMatch(y -> y == x))
                .toArray();
    }
}
