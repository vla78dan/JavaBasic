package com.hyperskill.example.ternary;

import java.util.Scanner;

public class Eq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n == 10 ? "Equal" : "Not Equal");

        sc.close();
    }
}
