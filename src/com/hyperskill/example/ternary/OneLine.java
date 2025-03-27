package com.hyperskill.example.ternary;

import java.util.Scanner;

public class OneLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        System.out.println((q >0) ? "Positive" : (q < 0) ? "Negative" : "Zero");
        scanner.close();
    }
}
