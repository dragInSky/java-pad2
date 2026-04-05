package lr3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Количество людей должно быть положительным.");
            return;
        }

        long t1 = System.nanoTime();
        int winner1 = findWinnerArrayList(n);
        long time1 = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        int winner2 = findWinnerLinkedList(n);
        long time2 = System.nanoTime() - t2;

        System.out.println("ArrayList: " + winner1);
        System.out.println("Время: " + toMillis(time1) + " мс");
        System.out.println("LinkedList: " + winner2);
        System.out.println("Время: " + toMillis(time2) + " мс");

        if (time1 < time2) {
            System.out.println("Быстрее ArrayList");
        } else if (time2 < time1) {
            System.out.println("Быстрее LinkedList");
        } else {
            System.out.println("Время одинаковое");
        }

        System.out.println("Обычно ArrayList работает быстрее из-за массива.");
        System.out.println("LinkedList медленнее из-за переходов по узлам.");
    }

    private static int findWinnerArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    private static int findWinnerLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        ListIterator<Integer> it = list.listIterator();
        boolean delete = true;

        while (list.size() > 1) {
            if (!it.hasNext()) {
                it = list.listIterator();
            }

            it.next();
            delete = !delete;
            if (delete) {
                it.remove();
            }
        }

        return list.getFirst();
    }

    private static double toMillis(long nanos) {
        return nanos / 1_000_000.0;
    }
}
