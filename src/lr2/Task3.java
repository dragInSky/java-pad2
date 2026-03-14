package lr2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();

        System.out.println("Введите ключ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        String encrypted = transform(text, shift);
        System.out.println("Текст после преобразования: " + encrypted);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("y")) {
            String decrypted = transform(encrypted, -shift);
            System.out.println("Обратное преобразование: " + decrypted);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    private static String transform(String source, int shift) {
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + shift);
        }
        return new String(chars);
    }
}
