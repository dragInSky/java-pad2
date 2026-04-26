package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task8 {
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

        System.out.print("Введите минимальную длину: ");
        int minLength = scanner.nextInt();

        List<String> result = filterStringsByLength(strings, minLength);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиннее " + minLength + ": " + result);
    }

    public static List<String> filterStringsByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
