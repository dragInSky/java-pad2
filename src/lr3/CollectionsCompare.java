package lr3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsCompare {
    private static final int N = 1_000_000;
    private static final int COUNT = 1_000_000;
    private static final long PRINT_INTERVAL = 60_000;
    private static long lastPrintTime;

    public static void main(String[] args) {
        System.out.println("Вариант 7");
        System.out.println("Коллекции: ArrayDeque, ArrayList, LinkedList");
        System.out.println("Количество элементов: " + N);
        System.out.println("Количество операций получения по индексу: " + COUNT);
        System.out.println();

        long dequeAddFirst = getTimeAddFirstArrayDeque(N);
        long dequeAddMiddle = -1;
        long dequeAddLast = getTimeAddLastArrayDeque(N);

        long arrayListAddFirst = getTimeAddFirstArrayList(N);
        long arrayListAddMiddle = getTimeAddMiddleArrayList(N);
        long arrayListAddLast = getTimeAddLastArrayList(N);

        long linkedListAddFirst = getTimeAddFirstLinkedList(N);
        long linkedListAddMiddle = getTimeAddMiddleLinkedList(N);
        long linkedListAddLast = getTimeAddLastLinkedList(N);

        long dequeRemoveFirst = getTimeRemoveFirstArrayDeque(N);
        long dequeRemoveMiddle = -1;
        long dequeRemoveLast = getTimeRemoveLastArrayDeque(N);

        long arrayListRemoveFirst = getTimeRemoveFirstArrayList(N);
        long arrayListRemoveMiddle = getTimeRemoveMiddleArrayList(N);
        long arrayListRemoveLast = getTimeRemoveLastArrayList(N);

        long linkedListRemoveFirst = getTimeRemoveFirstLinkedList(N);
        long linkedListRemoveMiddle = getTimeRemoveMiddleLinkedList(N);
        long linkedListRemoveLast = getTimeRemoveLastLinkedList(N);

        long dequeGet = -1;
        long arrayListGet = getTimeGetArrayList(N, COUNT);
        long linkedListGet = getTimeGetLinkedList(N, COUNT);

        System.out.println("Таблица 1. Добавление");
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Коллекция", "Начало", "Середина", "Конец");
        printLine();
        System.out.printf("%-12s %-12s %-12s %-12s%n", "ArrayDeque", format(dequeAddFirst), format(dequeAddMiddle), format(dequeAddLast));
        System.out.printf("%-12s %-12s %-12s %-12s%n", "ArrayList", format(arrayListAddFirst), format(arrayListAddMiddle), format(arrayListAddLast));
        System.out.printf("%-12s %-12s %-12s %-12s%n", "LinkedList", format(linkedListAddFirst), format(linkedListAddMiddle), format(linkedListAddLast));
        System.out.println();

        System.out.println("Таблица 2. Удаление");
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Коллекция", "Начало", "Середина", "Конец");
        printLine();
        System.out.printf("%-12s %-12s %-12s %-12s%n", "ArrayDeque", format(dequeRemoveFirst), format(dequeRemoveMiddle), format(dequeRemoveLast));
        System.out.printf("%-12s %-12s %-12s %-12s%n", "ArrayList", format(arrayListRemoveFirst), format(arrayListRemoveMiddle), format(arrayListRemoveLast));
        System.out.printf("%-12s %-12s %-12s %-12s%n", "LinkedList", format(linkedListRemoveFirst), format(linkedListRemoveMiddle), format(linkedListRemoveLast));
        System.out.println();

        System.out.println("Таблица 3. Получение по индексу");
        System.out.println("Количество операций: " + COUNT);
        System.out.printf("%-12s %-12s%n", "Коллекция", "Время");
        printLine();
        System.out.printf("%-12s %-12s%n", "ArrayDeque", format(dequeGet));
        System.out.printf("%-12s %-12s%n", "ArrayList", format(arrayListGet));
        System.out.printf("%-12s %-12s%n", "LinkedList", format(linkedListGet));
    }

    private static long getTimeAddFirstArrayDeque(int n) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(n);
        startOperation("ArrayDeque добавление в начало");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.addFirst(i);
            printProgress("ArrayDeque добавление в начало", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddLastArrayDeque(int n) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(n);
        startOperation("ArrayDeque добавление в конец");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            deque.addLast(i);
            printProgress("ArrayDeque добавление в конец", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddFirstArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        startOperation("ArrayList добавление в начало");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(0, i);
            printProgress("ArrayList добавление в начало", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddMiddleArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        startOperation("ArrayList добавление в середину");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(list.size() / 2, i);
            printProgress("ArrayList добавление в середину", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddLastArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        startOperation("ArrayList добавление в конец");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
            printProgress("ArrayList добавление в конец", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddFirstLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        startOperation("LinkedList добавление в начало");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.addFirst(i);
            printProgress("LinkedList добавление в начало", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddMiddleLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        startOperation("LinkedList добавление в середину");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(list.size() / 2, i);
            printProgress("LinkedList добавление в середину", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeAddLastLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        startOperation("LinkedList добавление в конец");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.addLast(i);
            printProgress("LinkedList добавление в конец", i + 1L, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveFirstArrayDeque(int n) {
        ArrayDeque<Integer> deque = createArrayDeque(n);
        long done = 0;
        startOperation("ArrayDeque удаление из начала");
        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeFirst();
            done++;
            printProgress("ArrayDeque удаление из начала", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveLastArrayDeque(int n) {
        ArrayDeque<Integer> deque = createArrayDeque(n);
        long done = 0;
        startOperation("ArrayDeque удаление из конца");
        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeLast();
            done++;
            printProgress("ArrayDeque удаление из конца", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveFirstArrayList(int n) {
        ArrayList<Integer> list = createArrayList(n);
        long done = 0;
        startOperation("ArrayList удаление из начала");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
            done++;
            printProgress("ArrayList удаление из начала", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveMiddleArrayList(int n) {
        ArrayList<Integer> list = createArrayList(n);
        long done = 0;
        startOperation("ArrayList удаление из середины");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
            done++;
            printProgress("ArrayList удаление из середины", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveLastArrayList(int n) {
        ArrayList<Integer> list = createArrayList(n);
        long done = 0;
        startOperation("ArrayList удаление из конца");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
            done++;
            printProgress("ArrayList удаление из конца", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveFirstLinkedList(int n) {
        LinkedList<Integer> list = createLinkedList(n);
        long done = 0;
        startOperation("LinkedList удаление из начала");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.removeFirst();
            done++;
            printProgress("LinkedList удаление из начала", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveMiddleLinkedList(int n) {
        LinkedList<Integer> list = createLinkedList(n);
        long done = 0;
        startOperation("LinkedList удаление из середины");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
            done++;
            printProgress("LinkedList удаление из середины", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeRemoveLastLinkedList(int n) {
        LinkedList<Integer> list = createLinkedList(n);
        long done = 0;
        startOperation("LinkedList удаление из конца");
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.removeLast();
            done++;
            printProgress("LinkedList удаление из конца", done, n);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeGetArrayList(int n, int getCount) {
        ArrayList<Integer> list = createArrayList(n);
        startOperation("ArrayList получение по индексу");
        long start = System.currentTimeMillis();
        for (int i = 0; i < getCount; i++) {
            list.get(i % n);
            printProgress("ArrayList получение по индексу", i + 1L, getCount);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getTimeGetLinkedList(int n, int getCount) {
        LinkedList<Integer> list = createLinkedList(n);
        startOperation("LinkedList получение по индексу");
        long start = System.currentTimeMillis();
        for (int i = 0; i < getCount; i++) {
            list.get(i % n);
            printProgress("LinkedList получение по индексу", i + 1L, getCount);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static ArrayDeque<Integer> createArrayDeque(int n) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            deque.addLast(i);
        }
        return deque;
    }

    private static ArrayList<Integer> createArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    private static LinkedList<Integer> createLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    private static void printLine() {
        System.out.println("----------------------------------------------------");
    }

    private static void startOperation(String name) {
        System.out.println("Сейчас: " + name);
        lastPrintTime = System.currentTimeMillis();
    }

    private static void printProgress(String name, long current, long total) {
        long now = System.currentTimeMillis();
        if (now - lastPrintTime >= PRINT_INTERVAL) {
            System.out.println(name + ": " + current + " из " + total);
            lastPrintTime = now;
        }
    }

    private static String format(long time) {
        if (time < 0) {
            return "нет";
        }
        return time + " мс";
    }
}
