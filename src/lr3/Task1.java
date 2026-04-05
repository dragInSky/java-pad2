package lr3;

public class Task1 {
    private static int step;

    public static void main(String[] args) {
        System.out.println("Пример 1");
        printSequenceDirect(1);

        System.out.println();
        System.out.println("Пример 2");
        printSequenceReverse(1);

        System.out.println();
        System.out.println("Пример 3");
        step = 0;
        printRecursionTrace(1);

        System.out.println();
        System.out.println("Пример 4");
        int n1 = 5;
        System.out.println("Факториал " + n1 + " = " + factorial(n1));

        System.out.println();
        System.out.println("Пример 5");
        int n2 = 6;
        System.out.println("Число Фибоначчи " + n2 + " = " + fibonacci(n2));
        System.out.println("Обход вызовов:");
        printFibonacciTraversal(n2, 0);
    }

    private static void printSequenceDirect(int x) {
        System.out.println("x=" + x);
        if (2 * x + 1 < 20) {
            printSequenceDirect(2 * x + 1);
        }
    }

    private static void printSequenceReverse(int x) {
        if (2 * x + 1 < 20) {
            printSequenceReverse(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    private static void printRecursionTrace(int x) {
        printSpaces(step);
        System.out.println(x + " ->");
        step++;
        if (2 * x + 1 < 20) {
            printRecursionTrace(2 * x + 1);
        }
        step--;
        printSpaces(step);
        System.out.println(x + " <-");
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Номер числа Фибоначчи не может быть отрицательным");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static long printFibonacciTraversal(int n, int depth) {
        printSpaces(depth);
        System.out.println("вызов f(" + n + ")");

        long result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = printFibonacciTraversal(n - 1, depth + 1)
                    + printFibonacciTraversal(n - 2, depth + 1);
        }

        printSpaces(depth);
        System.out.println("f(" + n + ") = " + result);
        return result;
    }
}
