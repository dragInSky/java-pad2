package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings.add(scanner.nextLine());
        }

        List<String> result = filterCapitalizedStrings(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки с заглавной буквы: " + result);
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
