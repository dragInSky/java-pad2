package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
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

        System.out.print("Введите подстроку для поиска: ");
        String substring = scanner.nextLine();

        List<String> result = filterStringsBySubstring(strings, substring);

        System.out.println("Исходный список: " + strings);
        System.out.println("Подходящие строки: " + result);
    }

    public static List<String> filterStringsBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
