package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.print("Введите пороговое значение: ");
        int threshold = scanner.nextInt();

        List<Integer> result = filterNumbersLessThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа меньше " + threshold + ": " + result);
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(x -> x < threshold)
                .collect(Collectors.toList());
    }
}
