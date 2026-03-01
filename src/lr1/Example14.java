package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = in.nextInt();

        int first = n - 1;
        int second = n;
        int third = n + 1;

        int sum = first + second + third;
        int fourth = sum * sum;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        in.close();
    }
}