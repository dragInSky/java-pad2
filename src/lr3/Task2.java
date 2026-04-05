package lr3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.println("Двоичное представление: " + toBinary(number));
    }

    private static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }
        if (number < 0) {
            return "-" + toBinary(-number);
        }
        return toBinaryPositive(number);
    }

    private static String toBinaryPositive(int number) {
        if (number < 2) {
            return Integer.toString(number);
        }
        return toBinaryPositive(number / 2) + (number % 2);
    }
}
