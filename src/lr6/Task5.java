package lr6;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {8, 14, 3, 27, 19, 4, 32, 11, 6, 23};

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальный элемент: " + findMax(array));
    }

    public static int findMax(int[] array) throws InterruptedException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int threadCount = Runtime.getRuntime().availableProcessors();
        int[] maxValues = new int[threadCount];
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            int threadIndex = i;
            int start = threadIndex * array.length / threadCount;
            int end = (threadIndex + 1) * array.length / threadCount;

            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                maxValues[threadIndex] = max;
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int result = maxValues[0];
        for (int i = 1; i < maxValues.length; i++) {
            if (maxValues[i] > result) {
                result = maxValues[i];
            }
        }

        return result;
    }
}
