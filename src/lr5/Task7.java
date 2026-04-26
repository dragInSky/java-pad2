package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Делитель не может быть равен нулю");
            return;
        }

        List<Integer> result = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа без остатка на " + divisor + ": " + result);
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
