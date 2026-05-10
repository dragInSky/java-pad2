package timus.task_1563;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        HashSet<String> shops = new HashSet<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            if (shops.contains(name)) {
                count++;
            } else {
                shops.add(name);
            }
        }

        System.out.println(count);
    }
}