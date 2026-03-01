package timus.task_1243;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        BigInteger seven = BigInteger.valueOf(7);

        System.out.println(n.mod(seven));
    }
}