package timus.task_1349;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int n = id.nextInt();

        if (n == 1) {
            System.out.println("1 2 3");
        } else if (n == 2) {
            System.out.println("3 4 5");
        } else {
            System.out.println(-1);
        }
    }
}