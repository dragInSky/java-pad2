package timus.task_1149;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int n = id.nextInt();

        String[] nums = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            nums[i] = buildA(i);
        }

        String result = nums[1] + "+" + n;

        for (int i = 2; i <= n; i++) {
            result = "(" + result + ")" + nums[i] + "+" + (n - i + 1);
        }

        System.out.println(result);
    }

    public static String buildA(int n) {
        String result = "sin(" + n + ")";

        for (int i = n - 1; i >= 1; i--) {
            if (i % 2 == 1) {
                result = "sin(" + i + "-" + result + ")";
            } else {
                result = "sin(" + i + "+" + result + ")";
            }
        }

        return result;
    }
}