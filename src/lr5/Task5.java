package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        List<Integer> result = squareList(numbers);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Квадраты чисел: " + result);
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
