package timus.task_1327;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        int a = id.nextInt();
        int b = id.nextInt();

        int result = (b + 1) / 2 - a / 2;

        System.out.println(result);
    }
}