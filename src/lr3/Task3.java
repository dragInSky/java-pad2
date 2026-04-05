package lr3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        fillArray(array, 0, scanner);

        System.out.println("Введенный массив: " + arrayToString(array, 0));
    }

    private static void fillArray(int[] array, int index, Scanner scanner) {
        if (index >= array.length) {
            return;
        }
        System.out.print("array[" + index + "] = ");
        array[index] = scanner.nextInt();
        fillArray(array, index + 1, scanner);
    }

    private static String arrayToString(int[] array, int index) {
        if (index >= array.length) {
            return "[]";
        }
        return "[" + arrayToStringBody(array, index) + "]";
    }

    private static String arrayToStringBody(int[] array, int index) {
        if (index == array.length - 1) {
            return Integer.toString(array[index]);
        }
        return array[index] + ", " + arrayToStringBody(array, index + 1);
    }
}
