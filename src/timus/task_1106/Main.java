package timus.task_1106;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer>[] nums;
    static int[] color;

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int size = id.nextInt();

        nums = new ArrayList[size + 1];
        color = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            nums[i] = new ArrayList<>();
        }

        for (int i = 1; i <= size; i++) {
            int x = id.nextInt();
            while (x != 0) {
                nums[i].add(x);
                x = id.nextInt();
            }
        }

        for (int i = 1; i <= size; i++) {
            if (nums[i].size() == 0) {
                System.out.println(0);
                return;
            }
        }

        for (int i = 1; i <= size; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                dfs(i);
            }
        }

        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (color[i] == 1) {
                count++;
            }
        }

        if (count == 0 || count == size) {
            System.out.println(0);
            return;
        }

        System.out.println(count);
        boolean first = true;

        for (int i = 1; i <= size; i++) {
            if (color[i] == 1) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }

    public static void dfs(int v) {
        for (int i = 0; i < nums[v].size(); i++) {
            int to = nums[v].get(i);
            if (color[to] == 0) {
                color[to] = 3 - color[v];
                dfs(to);
            }
        }
    }
}