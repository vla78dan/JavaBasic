package com.hyperskill.ex.everyday;

import java.util.Scanner;

public class Tall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if (h1 <= h2 && h2 <= h3 || h3 <= h2 && h2 <= h1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
