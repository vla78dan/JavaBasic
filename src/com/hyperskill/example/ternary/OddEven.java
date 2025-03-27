package com.hyperskill.example.ternary;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "even" : "odd");
        scanner.close();
    }
}
