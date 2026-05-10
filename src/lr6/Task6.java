package lr6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {8, 14, 3, 27, 19, 4, 32, 11, 6, 23};

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма элементов: " + sum(array));
    }

    public static int sum(int[] array) throws InterruptedException {
        int threadCount = Runtime.getRuntime().availableProcessors();
        int[] sums = new int[threadCount];
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            int threadIndex = i;
            int start = threadIndex * array.length / threadCount;
            int end = (threadIndex + 1) * array.length / threadCount;

            threads[i] = new Thread(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                sums[threadIndex] = sum;
            });
            threads[i].start();
        }

        int result = 0;
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
            result += sums[i];
        }

        return result;
    }
}
