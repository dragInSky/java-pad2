package lr2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = id.nextInt();
        System.out.println("Размер: " + size);

        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("a[" + i + "] = " + nums[i]);
        }

        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }

        System.out.println("Минимум = " + minValue);
        System.out.println("Позиции минимума:");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minValue) {
                System.out.println("index " + i + ", value " + nums[i]);
            }
        }
    }
}
