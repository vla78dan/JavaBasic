package com.lernjava.ex;

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number A:");
        int a = scanner.nextInt();

        System.out.println("Please enter the number B:");
        int b = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println();

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);
        System.out.println();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
        System.out.println();

        scanner.close();
    }
}
